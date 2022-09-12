package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cqbb  reason: default package */
/* loaded from: classes5.dex */
final class cqbb extends rx implements View.OnClickListener {
    private final String a;

    public cqbb(Context context, String str) {
        super(context, 0);
        this.a = str;
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.dismiss_button) {
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.rx, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f();
        setContentView(R.layout.material_info_dialog);
        findViewById(R.id.dismiss_button).setOnClickListener(this);
        ((TextView) findViewById(R.id.dialog_text)).setText(this.a);
    }
}
