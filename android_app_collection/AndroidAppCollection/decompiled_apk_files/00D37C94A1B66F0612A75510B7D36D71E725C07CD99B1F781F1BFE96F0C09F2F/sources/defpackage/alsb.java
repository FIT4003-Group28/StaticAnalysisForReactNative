package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: alsb  reason: default package */
/* loaded from: classes.dex */
public final class alsb {
    public final List a;

    public alsb() {
        this.a = new ArrayList();
    }

    public alsb(alsa alsaVar) {
        this.a = alsaVar.a;
    }

    public final synchronized chn a(Class cls) {
        for (csv csvVar : this.a) {
            if (csvVar.a.isAssignableFrom(cls)) {
                return csvVar.b;
            }
        }
        return null;
    }

    public final synchronized void b(Class cls, chn chnVar) {
        this.a.add(new csv(cls, chnVar));
    }
}
