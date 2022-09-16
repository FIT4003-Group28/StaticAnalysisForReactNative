package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/* compiled from: PG */
/* renamed from: adhd  reason: default package */
/* loaded from: classes.dex */
public final class adhd extends bfl {
    protected final bhc Y;
    public final azqb Z;

    public adhd(Context context, int i, azqb azqbVar) {
        super(context, i);
        bhd.b(getContext());
        this.Y = bhd.j();
        azqbVar.getClass();
        this.Z = azqbVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bfl, defpackage.nx, defpackage.ov, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Button button = (Button) findViewById(16908313);
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: adhc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    adhd adhdVar = adhd.this;
                    if (adhdVar.Y.m()) {
                        ((adgc) adhdVar.Z.get()).S();
                    }
                    adhdVar.dismiss();
                }
            });
        }
    }
}
