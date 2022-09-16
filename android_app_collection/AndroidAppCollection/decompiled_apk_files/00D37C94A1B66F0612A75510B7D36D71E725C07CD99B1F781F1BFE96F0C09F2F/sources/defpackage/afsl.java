package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: afsl  reason: default package */
/* loaded from: classes.dex */
public final class afsl implements ajmr {
    protected final Executor a;
    protected final yqh b;
    public final snc c;
    protected final String d;
    protected final aftt e;
    public final ykg f;
    public final ajmm g;
    public final apfc h;
    private final afyf i;
    private final afyf j;
    private final afyf k;
    private final azqb l;
    private final amqo m;

    public afsl(Executor executor, Context context, yqh yqhVar, azqb azqbVar, File file, snc sncVar, apfc apfcVar, ajmm ajmmVar, final azqb azqbVar2, final azqb azqbVar3, ampq ampqVar) {
        afyf c;
        afyf ajngVar;
        afyf c2;
        String absolutePath = file != null ? file.getAbsolutePath() : null;
        executor.getClass();
        this.a = executor;
        yqhVar.getClass();
        this.b = yqhVar;
        sncVar.getClass();
        this.c = sncVar;
        this.d = absolutePath;
        aftt afttVar = new aftt();
        this.e = afttVar;
        this.l = azqbVar;
        this.h = apfcVar;
        amqo i = aqxo.i(new amqo() { // from class: ajmj
            @Override // defpackage.amqo
            public final Object get() {
                afsl afslVar = afsl.this;
                return (!afslVar.h.m || !((akwp) azqbVar3.get()).b(afslVar.h.o, akvj.STREAMZ_DEFAULT_IMAGE_CLIENT_SAMPLING)) ? amon.a : ampq.j((akvm) azqbVar2.get());
            }
        });
        this.m = i;
        if (absolutePath != null) {
            ykr j = ykr.j(absolutePath, ydy.c);
            j.n(executor);
            this.f = j;
        } else {
            this.f = null;
        }
        this.g = ajmmVar;
        ykg ykgVar = this.f;
        ykg a = ajmmVar.a();
        azqb azqbVar4 = (azqb) ampqVar.f();
        if (ykgVar == null) {
            if (apfcVar.n) {
                c = new afxu((yqw) azqbVar.get(), new aftj(new aftp()));
            } else {
                c = c(afttVar, new aftl());
            }
            ajngVar = new ajng(c, i);
        } else {
            if (apfcVar.n) {
                c2 = new afxu((yqw) azqbVar.get(), new aftj(new aftq(sncVar, new aftp())));
            } else {
                c2 = c(afttVar, new aftm(sncVar, new aftl()));
            }
            ajngVar = new ajnf(ykgVar, new ajng(c2, i), sncVar, i);
        }
        afyf afxpVar = new afxp(new afxh(context.getContentResolver(), new afxc(context.getContentResolver(), ajngVar)));
        if (apfcVar.A && azqbVar4 != null) {
            afxpVar = new ajow((ajox) azqbVar4.get(), afxpVar);
        }
        afyf ajndVar = new ajnd(a, afxpVar, sncVar, i);
        this.i = ajndVar;
        this.j = b(ajndVar);
        afyf ajndVar2 = new ajnd(ajmmVar.b(), b(new afxj(ajndVar, new ajmh(), executor)), sncVar, i);
        this.k = apfcVar.p ? new afxl(ajndVar2) : ajndVar2;
    }

    @Override // defpackage.ajmr, defpackage.yys
    public final void a(Uri uri, yiw yiwVar) {
        this.k.a(uri, yiwVar);
    }

    protected final afxe b(afyf afyfVar) {
        return afxe.b(this.a, afyfVar);
    }

    protected final afxv c(aftr aftrVar, aftk aftkVar) {
        return new afxv(this.b, aftrVar, aftkVar);
    }

    @Override // defpackage.ajmr
    public final void d() {
        this.g.c();
    }

    public final void e(Uri uri) {
        this.f.b(uri);
        this.g.d(uri);
    }

    @Override // defpackage.ajmr
    public final void f(Uri uri, Uri uri2) {
        e(uri);
        e(uri2);
        g(uri2, new ajmk(this, uri));
    }

    @Override // defpackage.ajmr
    public final void g(Uri uri, yiw yiwVar) {
        this.j.a(uri, yiwVar);
    }

    @Override // defpackage.ajmr
    public final boolean h(Uri uri) {
        return this.f.e(uri);
    }
}
