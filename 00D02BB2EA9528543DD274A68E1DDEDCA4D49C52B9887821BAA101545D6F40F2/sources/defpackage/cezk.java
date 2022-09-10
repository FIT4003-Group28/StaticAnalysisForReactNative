package defpackage;

import android.util.Base64;
/* renamed from: cezk  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cezk implements dbsl {
    static final dbsl a = new cezk();

    private cezk() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        dlnm dlnmVar = (dlnm) obj;
        int a2 = dlmt.a(dlnmVar.b);
        int i = a2 - 1;
        if (a2 == 0) {
            throw null;
        }
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                return true;
            case 3:
                break;
            default:
                bvoo.h("Unsupported question type in post-trip. Question ID was %s", Base64.encode(dlnmVar.g.G(), 0));
                break;
        }
        return false;
    }
}
