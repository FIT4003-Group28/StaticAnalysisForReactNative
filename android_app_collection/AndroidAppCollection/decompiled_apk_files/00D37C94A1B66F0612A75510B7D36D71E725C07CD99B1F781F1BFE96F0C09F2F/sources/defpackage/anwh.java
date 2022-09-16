package defpackage;
/* compiled from: PG */
/* renamed from: anwh  reason: default package */
/* loaded from: classes.dex */
public class anwh extends Exception {
    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public anwh() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anwh(String str) {
        super(str);
        qnm.m(str, "Detail message must not be empty");
    }
}
