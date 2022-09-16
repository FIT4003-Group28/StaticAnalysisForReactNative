package defpackage;

import android.content.Context;
import android.media.MediaActionSound;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: yie  reason: default package */
/* loaded from: classes4.dex */
public final class yie implements axou {
    private final /* synthetic */ int a;

    public yie() {
    }

    public yie(int i) {
        this.a = i;
    }

    public static final Boolean a() {
        return Boolean.valueOf(yih.c(opf.b()));
    }

    public static yie b() {
        return new yie();
    }

    public static yqj c() {
        return yqj.a().a();
    }

    public static yjt d() {
        yjt a = yjt.a();
        axzl.o(a);
        return a;
    }

    public static Runnable e(Runnable runnable) {
        return runnable != null ? runnable : anlf.a;
    }

    public static zea f() {
        return new zea();
    }

    public static zgi g() {
        return new zgi();
    }

    public static MediaActionSound h() {
        return new MediaActionSound();
    }

    public static MediaMetadataRetriever i() {
        return new MediaMetadataRetriever();
    }

    public static znf j(axnm axnmVar, axnm axnmVar2, Context context) {
        return new znf(axnmVar, axnmVar2, context);
    }

    public static Executor k() {
        return new qrj(4);
    }

    public static aabw l() {
        return new aabw();
    }

    public static aacb m() {
        return new aacb();
    }

    public static abgg n() {
        return new abgg();
    }

    public static yie o() {
        return new yie(7);
    }

    public static xxs p() {
        return new xxs();
    }

    public static abrh q() {
        return new abrh();
    }

    public static zgt r() {
        return new zgt();
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.a) {
            case 0:
                return a();
            case 1:
                throw null;
            case 2:
                return zie.a();
            case 3:
                return new ylc();
            case 4:
                return 16;
            case 5:
                return c();
            case 6:
                return d();
            case 7:
                return e(null);
            case 8:
                return f();
            case 9:
                return new zew();
            case 10:
                return r();
            case 11:
                return g();
            case 12:
                throw null;
            case 13:
                throw null;
            case 14:
                throw null;
            case 15:
                return k();
            case 16:
                return l();
            case 17:
                return m();
            case 18:
                return amyc.b;
            case 19:
                return q();
            default:
                return n();
        }
    }
}
