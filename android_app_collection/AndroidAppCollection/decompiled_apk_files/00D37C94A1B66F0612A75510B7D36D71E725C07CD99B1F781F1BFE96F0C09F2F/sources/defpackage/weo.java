package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: weo  reason: default package */
/* loaded from: classes4.dex */
public final class weo implements ajry {
    private final Context a;
    private final /* synthetic */ int b;

    public weo(Context context, int i) {
        this.b = i;
        context.getClass();
        this.a = context;
    }

    public weo(Context context, int i, int[] iArr) {
        this.b = i;
        this.a = context;
    }

    public weo(Context context, int i, short[] sArr) {
        this.b = i;
        this.a = context;
    }

    public weo(Context context) {
        context.getClass();
        this.a = context;
    }

    public weo(Context context, int i, byte[] bArr) {
        this.b = i;
        context.getClass();
        this.a = context;
    }

    public weo(Context context, int i, char[] cArr) {
        this.b = i;
        context.getClass();
        this.a = context;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return new mjh(this.a);
            }
            if (i == 2) {
                return new wfd(this.a);
            }
            if (i == 3) {
                return new wfj(this.a);
            }
            if (i == 4) {
                return new akoe(this.a);
            }
            return new lab(this.a, 3, (char[]) null);
        }
        return new lab(this.a, 2, (byte[]) null);
    }
}
