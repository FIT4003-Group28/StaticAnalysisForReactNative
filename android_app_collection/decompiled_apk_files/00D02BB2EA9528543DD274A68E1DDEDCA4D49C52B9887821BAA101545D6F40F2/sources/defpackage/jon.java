package defpackage;
/* compiled from: PG */
/* renamed from: jon  reason: default package */
/* loaded from: classes.dex */
public final class jon implements dbsl<afga> {
    private final auhi a;

    public jon(auhi auhiVar) {
        this.a = auhiVar;
    }

    @Override // defpackage.dbsl
    public final /* bridge */ /* synthetic */ boolean a(afga afgaVar) {
        afga afgaVar2 = afgaVar;
        if (!joo.d(this.a, afgaVar2.a)) {
            return afgaVar2.a.getBooleanExtra("homescreen_shortcut", false) && "https://www.google.com/maps/reserve".equals(afgaVar2.b().toString());
        }
        return true;
    }
}
