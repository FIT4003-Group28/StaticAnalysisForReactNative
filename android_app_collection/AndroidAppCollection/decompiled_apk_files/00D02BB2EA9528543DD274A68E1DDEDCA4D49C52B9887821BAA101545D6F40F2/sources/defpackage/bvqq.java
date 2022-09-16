package defpackage;

import android.content.Context;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: bvqq  reason: default package */
/* loaded from: classes.dex */
public final class bvqq extends Thread implements bvri {
    private final bvrj a;

    public bvqq(Context context, Runnable runnable, bvrj bvrjVar) {
        this(context, runnable, bvrjVar, bvrjVar.K);
    }

    public static void a(String str) {
        bvoo.f(new IllegalArgumentException(str));
    }

    @Override // defpackage.bvri
    public final bvrj b() {
        return this.a;
    }

    public bvqq(Context context, Runnable runnable, bvrj bvrjVar, String str) {
        super(new bvqn(bvrjVar, str, runnable), str);
        this.a = bvrjVar;
        try {
            bvqz.a(str);
        } catch (IllegalArgumentException e) {
            bvoo.f(e);
        }
        if (bvrjVar == bvrj.CURRENT) {
            a("Cannot start a GmmThread as Threads.CURRENT");
        }
        if (bvrjVar.J < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + R.styleable.AppCompatTheme_windowActionBarOverlay);
            sb.append("Hey, don't create a thread (");
            sb.append(str);
            sb.append(") with an android thread priority having a lower number than the UI thread's priority of ");
            sb.append(0);
            a(sb.toString());
        }
        bvqo.a(this, context);
    }
}
