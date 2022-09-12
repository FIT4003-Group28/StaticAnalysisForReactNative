package defpackage;

import android.content.Context;
import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: cqvf  reason: default package */
/* loaded from: classes.dex */
public class cqvf extends cqrt implements cqsn {
    public cqvf(int i) {
        super(i);
    }

    public CharSequence a(Context context) {
        Resources resources = context.getResources();
        int i = this.a;
        Object[] objArr = this.b;
        if (objArr.length > 0) {
            return resources.getString(i, objArr);
        }
        return resources.getText(i);
    }

    public cqvf(int i, Object... objArr) {
        super(i, objArr);
    }
}
