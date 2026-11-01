package br.mdclient.module;

public class ClientModule {
    public final String name;
    public final String description;
    private boolean enabled;

    public ClientModule(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public boolean isEnabled() { return enabled; }

    public void setEnabled(boolean enabled) {
        if (this.enabled == enabled) return;
        this.enabled = enabled;
        onToggle(enabled);
    }

    public void toggle() { setEnabled(!enabled); }
    protected void onToggle(boolean enabled) { }
}

