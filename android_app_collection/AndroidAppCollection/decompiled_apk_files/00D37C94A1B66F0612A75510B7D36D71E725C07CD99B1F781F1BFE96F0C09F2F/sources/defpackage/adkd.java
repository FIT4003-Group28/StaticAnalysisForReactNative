package defpackage;

import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInControllerImpl;
/* compiled from: PG */
/* renamed from: adkd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adkd implements ylv {
    private final /* synthetic */ int v;
    public static final /* synthetic */ adkd u = new adkd(20);
    public static final /* synthetic */ adkd t = new adkd(19);
    public static final /* synthetic */ adkd s = new adkd(18);
    public static final /* synthetic */ adkd r = new adkd(17);
    public static final /* synthetic */ adkd q = new adkd(16);
    public static final /* synthetic */ adkd p = new adkd(15);
    public static final /* synthetic */ adkd o = new adkd(14);
    public static final /* synthetic */ adkd n = new adkd(13);
    public static final /* synthetic */ adkd m = new adkd(12);
    public static final /* synthetic */ adkd l = new adkd(11);
    public static final /* synthetic */ adkd k = new adkd(10);
    public static final /* synthetic */ adkd j = new adkd(9);
    public static final /* synthetic */ adkd i = new adkd(8);
    public static final /* synthetic */ adkd h = new adkd(7);
    public static final /* synthetic */ adkd g = new adkd(6);
    public static final /* synthetic */ adkd f = new adkd(5);
    public static final /* synthetic */ adkd e = new adkd(4);
    public static final /* synthetic */ adkd d = new adkd(3);
    public static final /* synthetic */ adkd c = new adkd(2);
    public static final /* synthetic */ adkd b = new adkd(1);
    public static final /* synthetic */ adkd a = new adkd();

    private /* synthetic */ adkd() {
    }

    private /* synthetic */ adkd(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ylv
    public final void b(Throwable th) {
        switch (this.v) {
            case 0:
                adkg.b(th);
                return;
            case 1:
                adjt.a();
                return;
            case 2:
                zep.f(admi.a, "Error while retrieving the promotion counter ref id", th);
                return;
            case 3:
                zep.f(admi.a, "Error saving values in promotion storage.", th);
                return;
            case 4:
                zep.f(admi.a, "Error saving values in promotion storage during a reset.", th);
                return;
            case 5:
                int i2 = adqq.i;
                return;
            case 6:
                int i3 = adqq.i;
                return;
            case 7:
                adra.b(th);
                return;
            case 8:
                adra.c(th);
                return;
            case 9:
                zep.f("MDX.tvsignin.ExpressTvSignInDrawerController", "Failed to store passive device id for denylisting.", th);
                return;
            case 10:
                zep.f("MDX.tvsignin.ExpressTvSignInDrawerController", "Failed to store passive last time shown.", th);
                return;
            case 11:
                aduz.b();
                return;
            case 12:
                TvSignInControllerImpl.m(th);
                return;
            case 13:
                zep.d("Failed to store profile creation timestamp.", th);
                return;
            case 14:
                zep.d("There was an error saving mdx user stats", th);
                return;
            case 15:
                aepv.d();
                return;
            case 16:
                aexv.aF(th);
                return;
            case 17:
                afkj.c(afki.CACHE, th, "Fails to save the supported profile to disk.", new Object[0]);
                return;
            case 18:
                afus.c(2, 6, "Failed to clear supported profiles or save incremental version on OS mismatch.", th);
                return;
            case 19:
                afmq.h();
                return;
            default:
                afmq.i();
                return;
        }
    }

    @Override // defpackage.zdt
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.v) {
            case 0:
                adkg.b((Throwable) obj);
                return;
            case 1:
                Throwable th = (Throwable) obj;
                adjt.a();
                return;
            case 2:
                zep.f(admi.a, "Error while retrieving the promotion counter ref id", (Throwable) obj);
                return;
            case 3:
                zep.f(admi.a, "Error saving values in promotion storage.", (Throwable) obj);
                return;
            case 4:
                zep.f(admi.a, "Error saving values in promotion storage during a reset.", (Throwable) obj);
                return;
            case 5:
                Throwable th2 = (Throwable) obj;
                int i2 = adqq.i;
                return;
            case 6:
                Throwable th3 = (Throwable) obj;
                int i3 = adqq.i;
                return;
            case 7:
                adra.b((Throwable) obj);
                return;
            case 8:
                adra.c((Throwable) obj);
                return;
            case 9:
                zep.f("MDX.tvsignin.ExpressTvSignInDrawerController", "Failed to store passive device id for denylisting.", (Throwable) obj);
                return;
            case 10:
                zep.f("MDX.tvsignin.ExpressTvSignInDrawerController", "Failed to store passive last time shown.", (Throwable) obj);
                return;
            case 11:
                Throwable th4 = (Throwable) obj;
                aduz.b();
                return;
            case 12:
                TvSignInControllerImpl.m((Throwable) obj);
                return;
            case 13:
                zep.d("Failed to store profile creation timestamp.", (Throwable) obj);
                return;
            case 14:
                zep.d("There was an error saving mdx user stats", (Throwable) obj);
                return;
            case 15:
                Throwable th5 = (Throwable) obj;
                aepv.d();
                return;
            case 16:
                aexv.aF((Throwable) obj);
                return;
            case 17:
                afkj.c(afki.CACHE, (Throwable) obj, "Fails to save the supported profile to disk.", new Object[0]);
                return;
            case 18:
                afus.c(2, 6, "Failed to clear supported profiles or save incremental version on OS mismatch.", (Throwable) obj);
                return;
            case 19:
                Throwable th6 = (Throwable) obj;
                afmq.h();
                return;
            default:
                Throwable th7 = (Throwable) obj;
                afmq.i();
                return;
        }
    }
}
