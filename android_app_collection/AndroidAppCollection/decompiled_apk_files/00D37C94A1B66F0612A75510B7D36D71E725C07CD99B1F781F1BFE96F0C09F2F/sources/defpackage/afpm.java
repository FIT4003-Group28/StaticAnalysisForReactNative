package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: afpm  reason: default package */
/* loaded from: classes.dex */
public final class afpm implements tct {
    public final aksf a;
    public final Executor b;

    public afpm(aksf aksfVar, Executor executor) {
        this.a = aksfVar;
        this.b = executor;
    }

    @Override // defpackage.tct
    public final aooq a() {
        return avsw.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, tcs tcsVar) {
        final avsw avswVar = (avsw) obj;
        return aynr.j(new aynt() { // from class: afpk
            @Override // defpackage.aynt
            public final void a(final aysm aysmVar) {
                afpm afpmVar = afpm.this;
                avsw avswVar2 = avswVar;
                aksf aksfVar = afpmVar.a;
                aopa createBuilder = aseo.a.createBuilder();
                aseo aseoVar = avswVar2.c;
                if (aseoVar == null) {
                    aseoVar = aseo.a;
                }
                createBuilder.mergeFrom((aopi) aseoVar);
                akse akseVar = new akse(aksfVar.e, aksfVar.a.c(), createBuilder);
                akseVar.i();
                final ankt b = aksfVar.c.b(akseVar, aksfVar.b);
                b.qY(new Runnable() { // from class: afpl
                    @Override // java.lang.Runnable
                    public final void run() {
                        ankt anktVar = ankt.this;
                        aysm aysmVar2 = aysmVar;
                        try {
                            anlz.y(anktVar);
                        } catch (Exception e) {
                            String.valueOf(String.valueOf(e)).length();
                        }
                        aysmVar2.a();
                    }
                }, afpmVar.b);
            }
        });
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }
}
