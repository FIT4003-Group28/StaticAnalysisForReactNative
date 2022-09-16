package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dys  reason: default package */
/* loaded from: classes3.dex */
public final class dys extends yjg {
    public final azqb a;
    private final ankt c;

    public dys(azqb azqbVar, ankt anktVar) {
        this.a = azqbVar;
        this.c = anktVar;
    }

    @Override // defpackage.yjg
    public final void a() {
        ylx.i(this.c, new ylw() { // from class: dyr
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                dys dysVar = dys.this;
                if (((Boolean) obj).booleanValue()) {
                    agel.b((agcp) dysVar.a.get());
                }
            }
        });
    }
}
