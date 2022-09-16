package androidx.window.core;

import java.math.BigInteger;
/* compiled from: PG */
/* loaded from: classes.dex */
final class Version$bigInteger$2 extends azsu implements azrr {
    final /* synthetic */ Version this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Version$bigInteger$2(Version version) {
        super(0);
        this.this$0 = version;
    }

    @Override // defpackage.azrr
    /* renamed from: invoke  reason: collision with other method in class */
    public final BigInteger mo26invoke() {
        return BigInteger.valueOf(this.this$0.getMajor()).shiftLeft(32).or(BigInteger.valueOf(this.this$0.getMinor())).shiftLeft(32).or(BigInteger.valueOf(this.this$0.getPatch()));
    }
}
