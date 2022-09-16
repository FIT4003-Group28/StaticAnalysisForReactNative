package defpackage;

import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
/* compiled from: PG */
/* renamed from: dnb  reason: default package */
/* loaded from: classes3.dex */
public final class dnb extends YogaNodeJNIBase {
    public dnb() {
        super(YogaNative.jni_YGNodeNew());
    }

    protected final void finalize() {
        try {
            long j = this.a;
            if (j != 0) {
                this.a = 0L;
                YogaNative.jni_YGNodeFree(j);
            }
        } finally {
            super.finalize();
        }
    }

    public dnb(dmz dmzVar) {
        super(YogaNative.jni_YGNodeNewWithConfig(dmzVar.a));
    }
}
