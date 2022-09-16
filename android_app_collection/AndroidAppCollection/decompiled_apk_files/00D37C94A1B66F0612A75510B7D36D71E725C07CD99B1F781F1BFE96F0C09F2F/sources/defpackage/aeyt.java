package defpackage;
/* compiled from: PG */
/* renamed from: aeyt  reason: default package */
/* loaded from: classes.dex */
public final class aeyt extends afkc implements afma {
    public final String d;

    public aeyt(asy asyVar, String str, String str2) {
        super(asyVar, str);
        this.d = str2;
    }

    @Override // defpackage.afma
    public final String a(boolean z) {
        return true != z ? "staleconfig" : "manifest.unparseable";
    }

    @Override // defpackage.afma
    public final String b() {
        return this.d;
    }
}
