package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.widget.NestedScrollView;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.widget.Button;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: nx  reason: default package */
/* loaded from: classes3.dex */
public class nx extends ov implements DialogInterface {
    public final nv a;

    /* JADX INFO: Access modifiers changed from: protected */
    public nx(Context context, int i) {
        super(context, a(context, i));
        this.a = new nv(getContext(), this, getWindow());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(Context context, int i) {
        if ((i >>> 24) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final Button b(int i) {
        nv nvVar = this.a;
        return i != -2 ? nvVar.i : nvVar.l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0254 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0283  */
    @Override // defpackage.ov, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.a.q;
        if (nestedScrollView == null || !nestedScrollView.m(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.a.q;
        if (nestedScrollView == null || !nestedScrollView.m(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.ov, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.a.b(charSequence);
    }
}
