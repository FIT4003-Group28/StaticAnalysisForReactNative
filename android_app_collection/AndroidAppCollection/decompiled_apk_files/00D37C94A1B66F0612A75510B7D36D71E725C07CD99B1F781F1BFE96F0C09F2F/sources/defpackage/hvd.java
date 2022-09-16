package defpackage;

import android.app.Activity;
import android.net.Uri;
import java.util.Calendar;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: hvd  reason: default package */
/* loaded from: classes3.dex */
public final class hvd implements hvm {
    public static final amup c;
    public final Activity d;
    public final hux e;
    public final hvn f;
    public final acth g;
    public final htu h;
    public axae i = axae.DAY_OF_WEEK_NORMAL;
    public final aakr j;
    private final Executor l;
    public static final axae a = axae.DAY_OF_WEEK_NORMAL;
    public static final amvn b = amvn.s(axae.DAY_OF_WEEK_NORMAL, axae.DAY_OF_WEEK_LIGHT);
    private static final amup k = amup.l(axae.DAY_OF_WEEK_NORMAL, "", axae.DAY_OF_WEEK_LIGHT, "_secondary");

    static {
        amum h = amup.h();
        h.f(1, "sunday");
        h.f(2, "monday");
        h.f(3, "tuesday");
        h.f(4, "wednesday");
        h.f(5, "thursday");
        h.f(6, "friday");
        h.f(7, "saturday");
        c = h.b();
    }

    public hvd(Activity activity, hux huxVar, aakr aakrVar, Executor executor, hvn hvnVar, acth acthVar, htu htuVar, byte[] bArr, byte[] bArr2) {
        this.d = activity;
        this.e = huxVar;
        this.j = aakrVar;
        this.l = executor;
        this.f = hvnVar;
        this.g = acthVar;
        this.h = htuVar;
    }

    @Override // defpackage.hvm
    public final void a(final axaj axajVar) {
        axac axacVar;
        final Uri uri;
        axbk i = axajVar.c().i();
        if (i.c == 12) {
            axacVar = (axac) i.d;
        } else {
            axacVar = axac.a;
        }
        if ((axacVar.b & 2) != 0) {
            axad axadVar = axacVar.d;
            if (axadVar == null) {
                axadVar = axad.b;
            }
            aops aopsVar = new aops(axadVar.e, axad.a);
            axae b2 = axae.b(axadVar.d);
            if (b2 == null) {
                b2 = axae.DAY_OF_WEEK_STYLE_UNSPECIFIED;
            }
            this.i = (axae) aopsVar.get((aopsVar.indexOf(b2) + 1) % aopsVar.size());
            String str = (String) c.get(Integer.valueOf(Calendar.getInstance().get(7)));
            String str2 = (String) k.get(this.i);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 77 + String.valueOf(str2).length());
            sb.append("https://www.gstatic.com/youtube/kazoo/server/assets/stickers/day_of_week_");
            sb.append(str);
            sb.append(str2);
            sb.append(".png");
            uri = Uri.parse(sb.toString());
        } else {
            uri = null;
        }
        if (uri == null) {
            afus.b(2, 24, "VideoFX: Day of week sticker added without valid uri");
            this.f.aR(axajVar.mo52toBuilder());
            return;
        }
        this.g.oi().H(3, new acte(actj.EDIT_STICKER_TAP_TO_CHANGE_STYLE_BUTTON), null);
        this.l.execute(new Runnable() { // from class: hvb
            @Override // java.lang.Runnable
            public final void run() {
                hvd hvdVar = hvd.this;
                hvdVar.e.a(uri, new hvc(hvdVar, axajVar));
            }
        });
    }

    @Override // defpackage.hvm
    public final void mt(axbm axbmVar) {
    }
}
