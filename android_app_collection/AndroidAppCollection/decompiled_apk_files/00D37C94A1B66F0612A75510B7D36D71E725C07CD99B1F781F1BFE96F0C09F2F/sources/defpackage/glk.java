package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.function.Function;
/* compiled from: PG */
/* renamed from: glk  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class glk implements Function {
    private final /* synthetic */ int v;
    public static final /* synthetic */ glk u = new glk(20);
    public static final /* synthetic */ glk t = new glk(19);
    public static final /* synthetic */ glk s = new glk(18);
    public static final /* synthetic */ glk r = new glk(17);
    public static final /* synthetic */ glk q = new glk(16);
    public static final /* synthetic */ glk p = new glk(15);
    public static final /* synthetic */ glk o = new glk(14);
    public static final /* synthetic */ glk n = new glk(13);
    public static final /* synthetic */ glk m = new glk(12);
    public static final /* synthetic */ glk l = new glk(11);
    public static final /* synthetic */ glk k = new glk(10);
    public static final /* synthetic */ glk j = new glk(9);
    public static final /* synthetic */ glk i = new glk(8);
    public static final /* synthetic */ glk h = new glk(7);
    public static final /* synthetic */ glk g = new glk(6);
    public static final /* synthetic */ glk f = new glk(5);
    public static final /* synthetic */ glk e = new glk(4);
    public static final /* synthetic */ glk d = new glk(3);
    public static final /* synthetic */ glk c = new glk(2);
    public static final /* synthetic */ glk b = new glk(1);
    public static final /* synthetic */ glk a = new glk();

    private /* synthetic */ glk() {
    }

    private /* synthetic */ glk(int i2) {
        this.v = i2;
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        switch (this.v) {
            case 0:
                return function.getClass();
            case 1:
                return function.getClass();
            case 2:
                return function.getClass();
            case 3:
                return function.getClass();
            case 4:
                return function.getClass();
            case 5:
                return function.getClass();
            case 6:
                return function.getClass();
            case 7:
                return function.getClass();
            case 8:
                return function.getClass();
            case 9:
                return function.getClass();
            case 10:
                return function.getClass();
            case 11:
                return function.getClass();
            case 12:
                return function.getClass();
            case 13:
                return function.getClass();
            case 14:
                return function.getClass();
            case 15:
                return function.getClass();
            case 16:
                return function.getClass();
            case 17:
                return function.getClass();
            case 18:
                return function.getClass();
            case 19:
                return function.getClass();
            default:
                return function.getClass();
        }
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        switch (this.v) {
            case 0:
                return function.getClass();
            case 1:
                return function.getClass();
            case 2:
                return function.getClass();
            case 3:
                return function.getClass();
            case 4:
                return function.getClass();
            case 5:
                return function.getClass();
            case 6:
                return function.getClass();
            case 7:
                return function.getClass();
            case 8:
                return function.getClass();
            case 9:
                return function.getClass();
            case 10:
                return function.getClass();
            case 11:
                return function.getClass();
            case 12:
                return function.getClass();
            case 13:
                return function.getClass();
            case 14:
                return function.getClass();
            case 15:
                return function.getClass();
            case 16:
                return function.getClass();
            case 17:
                return function.getClass();
            case 18:
                return function.getClass();
            case 19:
                return function.getClass();
            default:
                return function.getClass();
        }
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        switch (this.v) {
            case 0:
                int i2 = gll.b;
                auld auldVar = ((aadd) obj).a().u;
                if (auldVar == null) {
                    auldVar = auld.a;
                }
                aull aullVar = auldVar.d;
                return aullVar == null ? aull.a : aullVar;
            case 1:
                return gtd.a((avhn) obj);
            case 2:
                return Boolean.valueOf(((aull) obj).t);
            case 3:
                return Boolean.valueOf(((aull) obj).f);
            case 4:
                return Boolean.valueOf(((aull) obj).o);
            case 5:
                return ((gto) obj).b();
            case 6:
                return Boolean.valueOf(((gto) obj).h());
            case 7:
                return ((gto) obj).a();
            case 8:
                return Long.valueOf(((auuo) obj).c);
            case 9:
                return (ibn) ((dp) obj);
            case 10:
                return (PlaybackStartDescriptor) ((Intent) obj).getParcelableExtra("com.google.android.apps.youtube.PlaybackStartDescriptor");
            case 11:
                return ((PlaybackStartDescriptor) obj).b;
            case 12:
                return hqp.f((PlaybackStartDescriptor) obj);
            case 13:
                return Boolean.valueOf(hqp.p((ReelWatchEndpointOuterClass$ReelWatchEndpoint) obj));
            case 14:
                return Long.valueOf(((iaj) obj).a);
            case 15:
                int i3 = ico.bD;
                return aafr.c(((Bundle) obj).getByteArray(gsw.a));
            case 16:
                int i4 = ico.bD;
                return Boolean.valueOf(((Bundle) obj).getBoolean("ReelWatchFragment.isInWatchWhileActivity", false));
            case 17:
                return ((iaj) obj).e;
            case 18:
                return ((iaj) obj).a();
            case 19:
                aulb b2 = aulb.b(((artv) obj).j);
                return b2 == null ? aulb.REEL_LOOP_BEHAVIOR_UNKNOWN : b2;
            default:
                apzg apzgVar = ((ReelWatchEndpointOuterClass$ReelWatchEndpoint) obj).u;
                return apzgVar == null ? apzg.a : apzgVar;
        }
    }
}
