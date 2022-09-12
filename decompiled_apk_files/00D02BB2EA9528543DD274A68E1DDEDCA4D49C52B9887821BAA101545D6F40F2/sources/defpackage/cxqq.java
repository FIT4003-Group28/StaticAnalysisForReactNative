package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cxqq  reason: default package */
/* loaded from: classes5.dex */
public final class cxqq implements cxnv {
    public final eaze a;
    public final eayu b;
    private final String c;

    public cxqq(String str, eaze eazeVar, eayu eayuVar) {
        this.c = str;
        this.a = eazeVar;
        this.b = eayuVar;
    }

    @Override // defpackage.cxnv
    public final void a() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cxqq) {
            cxqq cxqqVar = (cxqq) obj;
            if (TextUtils.equals(this.c, cxqqVar.c) && this.a.equals(cxqqVar.a) && this.b.equals(cxqqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.a, this.b});
    }
}
