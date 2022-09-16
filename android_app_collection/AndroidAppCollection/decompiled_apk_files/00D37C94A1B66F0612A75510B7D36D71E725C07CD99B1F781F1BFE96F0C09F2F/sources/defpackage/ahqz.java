package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: ahqz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ahqz implements ahjt {
    public final /* synthetic */ Handler a;
    public final /* synthetic */ ahrd b;
    public final /* synthetic */ ahob c;
    private final /* synthetic */ int d;

    public /* synthetic */ ahqz(Handler handler, ahrd ahrdVar, ahob ahobVar) {
        this.a = handler;
        this.b = ahrdVar;
        this.c = ahobVar;
    }

    public /* synthetic */ ahqz(Handler handler, ahrd ahrdVar, ahob ahobVar, int i) {
        this.d = i;
        this.a = handler;
        this.b = ahrdVar;
        this.c = ahobVar;
    }

    @Override // defpackage.ahjt
    public final void a() {
        if (this.d == 0) {
            Handler handler = this.a;
            ahrd ahrdVar = this.b;
            ahob ahobVar = this.c;
            handler.post(new ahra(ahrdVar));
            ahobVar.g();
            return;
        }
        Handler handler2 = this.a;
        ahrd ahrdVar2 = this.b;
        ahob ahobVar2 = this.c;
        handler2.post(new ahra(ahrdVar2, 1));
        ahobVar2.a.b.l = false;
        ahnz ahnzVar = ahobVar2.i;
        if (ahnzVar == null) {
            return;
        }
        ((ahpx) ahnzVar).k();
    }
}
