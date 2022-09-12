package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: jeo  reason: default package */
/* loaded from: classes7.dex */
public class jeo<T extends cqkp> extends Dialog {
    private final cqiw<T> a;
    @dzsi
    private cqkf<T> b;
    private final cqkj c;
    private final T d;

    public jeo(Context context, int i, cqiw<T> cqiwVar, T t, cqkj cqkjVar) {
        super(context, i);
        this.a = cqiwVar;
        this.c = cqkjVar;
        this.d = t;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        cqkf<T> cqkfVar = this.b;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(@dzsi Bundle bundle) {
        super.onCreate(bundle);
        cqkf<T> c = this.c.c(this.a, null);
        this.b = c;
        setContentView(c.c());
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        cqkf<T> cqkfVar = this.b;
        if (cqkfVar != null) {
            cqkfVar.e(this.d);
        }
    }

    public jeo(Context context, cqiw<T> cqiwVar, T t, cqkj cqkjVar) {
        this(context, 0, cqiwVar, t, cqkjVar);
    }
}
