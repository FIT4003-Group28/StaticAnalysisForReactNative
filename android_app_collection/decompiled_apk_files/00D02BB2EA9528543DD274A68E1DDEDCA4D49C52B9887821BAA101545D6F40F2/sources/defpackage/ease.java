package defpackage;
/* compiled from: PG */
/* renamed from: ease  reason: default package */
/* loaded from: classes6.dex */
final class ease {
    private final easb[] a;
    private easd[] b = new easd[16];

    public ease(easb[] easbVarArr) {
        this.a = easbVarArr;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:75:0x001f A[EDGE_INSN: B:75:0x001f->B:15:0x001f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x001c -> B:4:0x0006). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0105 -> B:65:0x00f6). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final defpackage.easb a(java.lang.Class<?> r14) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ease.a(java.lang.Class):easb");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        return this.a.length;
    }

    final ease c(int i) {
        easb[] easbVarArr = this.a;
        int length = easbVarArr.length;
        if (i >= length) {
            throw new IndexOutOfBoundsException();
        }
        easb[] easbVarArr2 = new easb[length - 1];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (i3 != i) {
                easbVarArr2[i2] = easbVarArr[i3];
                i2++;
            }
        }
        return new ease(easbVarArr2);
    }
}
