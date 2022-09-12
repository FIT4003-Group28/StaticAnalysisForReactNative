package defpackage;

import android.view.Choreographer;
/* compiled from: PG */
/* renamed from: cskr  reason: default package */
/* loaded from: classes5.dex */
public abstract class cskr {
    private Choreographer.FrameCallback a;

    public abstract void a(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Choreographer.FrameCallback b() {
        if (this.a == null) {
            this.a = new Choreographer.FrameCallback(this) { // from class: cskq
                private final cskr a;

                {
                    this.a = this;
                }

                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    this.a.a(j);
                }
            };
        }
        return this.a;
    }
}
