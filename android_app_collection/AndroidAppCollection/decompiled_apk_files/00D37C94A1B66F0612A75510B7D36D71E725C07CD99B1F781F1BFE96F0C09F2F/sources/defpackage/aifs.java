package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.youtube.R;
import j$.time.Duration;
/* compiled from: PG */
/* renamed from: aifs  reason: default package */
/* loaded from: classes.dex */
public class aifs {
    public final Resources a;
    private final yve b;
    private aifr c;
    private aifr d;
    private int e;

    public aifs(Context context, yve yveVar) {
        this.b = yveVar;
        this.a = context.getResources();
    }

    public Duration a() {
        if ((((awvc) this.b.c()).b & 1) == 0) {
            Duration ofSeconds = Duration.ofSeconds(10L);
            ofSeconds.getClass();
            return ofSeconds;
        }
        aooo aoooVar = ((awvc) this.b.c()).c;
        if (aoooVar == null) {
            aoooVar = aooo.a;
        }
        return Duration.ofSeconds(aoooVar.b);
    }

    public final CharSequence b() {
        int seconds = (int) (this.e * a().getSeconds());
        return this.a.getQuantityString(R.plurals.quick_seek_x_second, seconds, Integer.valueOf(seconds));
    }

    public final void c(aifr aifrVar) {
        aifr aifrVar2 = this.d;
        this.c = aifrVar2;
        this.d = aifrVar;
        if (aifrVar2 != null && aifrVar2.b != this.d.b) {
            d();
        }
        this.e++;
    }

    public final void d() {
        this.e = 0;
    }
}
