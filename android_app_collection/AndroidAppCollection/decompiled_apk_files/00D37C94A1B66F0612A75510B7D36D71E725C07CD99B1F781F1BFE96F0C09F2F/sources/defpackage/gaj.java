package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
/* compiled from: PG */
/* renamed from: gaj  reason: default package */
/* loaded from: classes3.dex */
final class gaj extends gas {
    private final PaneDescriptor a;
    private final gbd b;
    private final PaneDescriptor c;

    public gaj(PaneDescriptor paneDescriptor, gbd gbdVar, PaneDescriptor paneDescriptor2) {
        this.a = paneDescriptor;
        this.b = gbdVar;
        if (paneDescriptor2 != null) {
            this.c = paneDescriptor2;
            return;
        }
        throw new NullPointerException("Null newDescriptor");
    }

    @Override // defpackage.gas
    public PaneDescriptor a() {
        return this.a;
    }

    @Override // defpackage.gas
    public PaneDescriptor b() {
        return this.c;
    }

    @Override // defpackage.gas
    public gbd c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gas) {
            gas gasVar = (gas) obj;
            PaneDescriptor paneDescriptor = this.a;
            if (paneDescriptor != null ? paneDescriptor.equals(gasVar.a()) : gasVar.a() == null) {
                gbd gbdVar = this.b;
                if (gbdVar != null ? gbdVar.equals(gasVar.c()) : gasVar.c() == null) {
                    if (this.c.equals(gasVar.b())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        PaneDescriptor paneDescriptor = this.a;
        int i = 0;
        int hashCode = ((paneDescriptor == null ? 0 : paneDescriptor.hashCode()) ^ 1000003) * 1000003;
        gbd gbdVar = this.b;
        if (gbdVar != null) {
            i = gbdVar.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 74 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("FragmentReplaceEvent{currentDescriptor=");
        sb.append(valueOf);
        sb.append(", currentFragment=");
        sb.append(valueOf2);
        sb.append(", newDescriptor=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
