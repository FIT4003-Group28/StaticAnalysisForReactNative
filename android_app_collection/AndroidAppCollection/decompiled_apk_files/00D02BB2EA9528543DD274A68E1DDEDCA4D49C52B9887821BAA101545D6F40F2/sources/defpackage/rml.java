package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: rml  reason: default package */
/* loaded from: classes7.dex */
public final class rml extends gen {
    public Activity a;
    public cqkj b;

    @Override // defpackage.gen
    public final Dialog i(@dzsi Bundle bundle) {
        iii iiiVar = new iii();
        iiiVar.a = this.a.getString(R.string.CLEAR_COMMUTE_SETTINGS_DIALOG_TITLE);
        iiiVar.b = this.a.getString(R.string.CLEAR_COMMUTE_SETTINGS_DIALOG_BODY);
        iiiVar.c(this.a.getString(R.string.CLEAR_COMMUTE_SETTINGS_DIALOG_CANCEL), null, cjtd.a(dtxl.bU));
        iiiVar.d(this.a.getString(R.string.CLEAR_COMMUTE_SETTINGS_DIALOG_CLEAR), new View.OnClickListener(this) { // from class: rmj
            private final rml a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.Nw(new rmk());
            }
        }, cjtd.a(dtxl.bV));
        return iiiVar.a(this.a, this.b).l();
    }
}
