package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.VideoSelectedActionOuterClass$VideoSelectedAction;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: htq  reason: default package */
/* loaded from: classes3.dex */
public final class htq {
    public static final long a = TimeUnit.DAYS.toMillis(7);
    public final snc b;
    public final dt c;
    public final vne d;
    private final afvn e;
    private final Handler f;

    public htq(afvn afvnVar, snc sncVar, dt dtVar, vne vneVar, Handler handler) {
        this.e = afvnVar;
        this.b = sncVar;
        this.c = dtVar;
        this.d = vneVar;
        this.f = handler;
    }

    public final boolean a(VideoSelectedActionOuterClass$VideoSelectedAction videoSelectedActionOuterClass$VideoSelectedAction) {
        if (!videoSelectedActionOuterClass$VideoSelectedAction.c) {
            return true;
        }
        try {
            long longValue = ((Long) Collections.unmodifiableMap(((hwp) this.d.a().get()).f).get(d())).longValue();
            if (longValue == 0) {
                return true;
            }
            return this.b.c() - longValue > a;
        } catch (Exception e) {
            zep.d("Could not read from protoStore", e);
            return true;
        }
    }

    public final int b(int i) {
        long j;
        try {
            hwp hwpVar = (hwp) this.d.a().get();
            if (i == 1) {
                j = ((Long) Collections.unmodifiableMap(hwpVar.f).get(d())).longValue();
            } else {
                j = hwpVar.e;
            }
            return (int) TimeUnit.DAYS.convert(a - (this.b.c() - j), TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            zep.d("Could not read from protoStore", e);
            return 0;
        }
    }

    public final void c(final int i) {
        final long c = this.b.c();
        this.f.post(new Runnable() { // from class: hto
            @Override // java.lang.Runnable
            public final void run() {
                final htq htqVar = htq.this;
                final int i2 = i;
                final long j = c;
                ylx.n(htqVar.c, htqVar.d.b(new ampg() { // from class: htn
                    @Override // defpackage.ampg
                    public final Object apply(Object obj) {
                        htq htqVar2 = htq.this;
                        int i3 = i2;
                        long j2 = j;
                        hwp hwpVar = (hwp) obj;
                        if (i3 == 1) {
                            aopa mo52toBuilder = hwpVar.mo52toBuilder();
                            mo52toBuilder.k(htqVar2.d(), j2);
                            return (hwp) mo52toBuilder.mo39build();
                        }
                        aopa mo52toBuilder2 = hwpVar.mo52toBuilder();
                        mo52toBuilder2.copyOnWrite();
                        ((hwp) mo52toBuilder2.instance).e = j2;
                        return (hwp) mo52toBuilder2.mo39build();
                    }
                }, anjk.a), hmv.g, hmv.h);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String d() {
        return TextUtils.concat(this.e.c().d(), "_", "ReelsCreatorWatchLaterStickerLastUsedTime").toString();
    }

    public final arag e(Context context) {
        int b = b(1);
        if (b == 0) {
            b = 1;
        }
        return ajgl.g(context.getResources().getQuantityString(R.plurals.sticker_dialog_title, b, Integer.valueOf(b)));
    }
}
