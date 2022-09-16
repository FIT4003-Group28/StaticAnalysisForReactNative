package defpackage;
/* compiled from: PG */
/* renamed from: albg  reason: default package */
/* loaded from: classes.dex */
public final class albg {
    public final alcw a;
    public final alcw b;

    public albg(alcw alcwVar, alcw alcwVar2) {
        this.a = alcwVar;
        this.b = alcwVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof albg)) {
            return false;
        }
        albg albgVar = (albg) obj;
        return akzj.f(this.a, albgVar.a) && akzj.f(this.b, albgVar.b);
    }
}
