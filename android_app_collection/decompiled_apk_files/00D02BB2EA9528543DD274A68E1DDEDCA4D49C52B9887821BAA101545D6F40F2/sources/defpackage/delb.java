package defpackage;
/* compiled from: PG */
/* renamed from: delb  reason: default package */
/* loaded from: classes6.dex */
public class delb extends Exception {
    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public delb() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public delb(String str) {
        super(str);
        cnwc.m(str, "Detail message must not be empty");
    }
}
