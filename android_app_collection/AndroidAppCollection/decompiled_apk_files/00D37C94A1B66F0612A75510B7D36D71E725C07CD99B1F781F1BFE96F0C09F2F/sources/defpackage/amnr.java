package defpackage;
/* compiled from: PG */
/* renamed from: amnr  reason: default package */
/* loaded from: classes.dex */
public final class amnr implements aymz {
    private final /* synthetic */ int a;

    public amnr() {
    }

    public amnr(int i) {
        this.a = i;
    }

    @Override // defpackage.aymz
    public final /* bridge */ /* synthetic */ ayna a(axye axyeVar, axyd axydVar) {
        if (this.a == 0) {
            return new amns(axyeVar, axydVar);
        }
        return new smb(axyeVar, axydVar);
    }
}
