package defpackage;

import android.os.Build;
import android.os.Trace;
import java.util.Random;
/* compiled from: PG */
/* renamed from: afcj  reason: default package */
/* loaded from: classes.dex */
final class afcj {
    private static final Random g = new Random();
    final aflm a;
    boolean b;
    boolean c;
    boolean d;
    final int e;
    int f;

    public afcj(aflm aflmVar, int i) {
        this.a = aflmVar;
        this.e = i;
        if (Build.VERSION.SDK_INT >= 29) {
            int nextInt = g.nextInt();
            this.f = nextInt;
            Trace.beginAsyncSection("ParsingAudio", nextInt);
            Trace.beginAsyncSection("ParsingVideo", this.f);
        }
    }
}
