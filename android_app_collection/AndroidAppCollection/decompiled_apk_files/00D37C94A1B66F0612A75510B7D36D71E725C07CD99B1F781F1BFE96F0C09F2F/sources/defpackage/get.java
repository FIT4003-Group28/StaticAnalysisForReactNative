package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: get  reason: default package */
/* loaded from: classes3.dex */
public final class get extends ajyt {
    private static final Class[] a = {avhy.class, fjw.class};
    private final ajsa b;
    private final Context c;

    public get(int i, ajsa ajsaVar, Context context) {
        super(i);
        ajsaVar.getClass();
        this.b = ajsaVar;
        this.c = context;
    }

    @Override // defpackage.ajyt, defpackage.ajrt
    public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
        Object obj;
        boolean z = false;
        if (b(ajqmVar, i)) {
            ajsa ajsaVar = this.b;
            Object c = ajqmVar.c(i);
            int i2 = i + 1;
            while (true) {
                if (i2 >= ajqmVar.a()) {
                    obj = null;
                    break;
                } else if (ajsaVar.c(ajqmVar.c(i2)) != -1) {
                    obj = ajqmVar.c(i2);
                    break;
                } else {
                    i2++;
                }
            }
            if (obj != null) {
                if (!zew.y(this.c) || !(c instanceof ajxr) || !(obj instanceof auuf)) {
                    Class<?> cls = obj.getClass();
                    Class[] clsArr = a;
                    for (int i3 = 0; i3 < 2; i3++) {
                        if (akzj.f(cls, clsArr[i3])) {
                            break;
                        }
                    }
                }
            }
            z = true;
        }
        ajrsVar.f("showLineSeparator", Boolean.valueOf(z));
    }
}
