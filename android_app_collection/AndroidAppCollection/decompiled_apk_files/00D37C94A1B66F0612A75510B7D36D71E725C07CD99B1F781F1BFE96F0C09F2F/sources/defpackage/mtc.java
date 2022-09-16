package defpackage;

import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mtc  reason: default package */
/* loaded from: classes3.dex */
final class mtc implements View.OnClickListener {
    final /* synthetic */ mte a;
    final /* synthetic */ mtf b;

    public mtc(mtf mtfVar, mte mteVar) {
        this.b = mtfVar;
        this.a = mteVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        awhu awhuVar = this.b.a;
        if (awhuVar == null) {
            return;
        }
        irh irhVar = (irh) this.a;
        if (irhVar.av == null) {
            View inflate = View.inflate(irhVar.ae, R.layout.ypc_offers_coupon_entry_dialog, null);
            irhVar.aw = (TextView) inflate.findViewById(R.id.prompt);
            irhVar.ax = (EditText) inflate.findViewById(R.id.coupon_entry);
            AlertDialog.Builder builder = new AlertDialog.Builder(irhVar.ae);
            arag aragVar = awhuVar.b;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            irhVar.av = builder.setTitle(ajgl.b(aragVar)).setView(inflate).setPositiveButton(R.string.done, new ira(irhVar, 1)).create();
            irhVar.av.getWindow().setSoftInputMode(5);
        }
        TextView textView = irhVar.aw;
        arag aragVar2 = awhuVar.c;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        textView.setText(ajgl.b(aragVar2));
        EditText editText = irhVar.ax;
        arag aragVar3 = awhuVar.d;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        editText.setHint(ajgl.b(aragVar3));
        irhVar.av.show();
    }
}
