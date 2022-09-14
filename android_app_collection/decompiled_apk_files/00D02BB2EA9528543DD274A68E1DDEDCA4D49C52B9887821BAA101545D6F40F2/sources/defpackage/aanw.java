package defpackage;
/* compiled from: PG */
/* renamed from: aanw  reason: default package */
/* loaded from: classes2.dex */
public class aanw implements aank {
    private final akla a;
    @dzsi
    private akle b;

    public aanw(akla aklaVar) {
        this.a = aklaVar;
    }

    @Override // defpackage.aank
    @dzsi
    public akle a() {
        return this.b;
    }

    public void b(diwb diwbVar) {
        akle akleVar;
        if ((diwbVar.b & 2) != 0) {
            akla aklaVar = this.a;
            dhxw dhxwVar = diwbVar.E;
            if (dhxwVar == null) {
                dhxwVar = dhxw.d;
            }
            akleVar = aklaVar.c(dhxwVar);
        } else {
            akleVar = null;
        }
        this.b = akleVar;
    }

    @Override // defpackage.aakt
    public Boolean c() {
        return Boolean.valueOf(this.b != null);
    }
}
