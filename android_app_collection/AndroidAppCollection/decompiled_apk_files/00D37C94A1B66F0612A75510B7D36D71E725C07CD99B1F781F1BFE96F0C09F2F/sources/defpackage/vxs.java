package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vxs  reason: default package */
/* loaded from: classes4.dex */
public final class vxs implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ EditText a;
    final /* synthetic */ vxu b;

    public vxs(vxu vxuVar, EditText editText) {
        this.b = vxuVar;
        this.a = editText;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        arag aragVar;
        if (adapterView.getSelectedItem() == vxt.a) {
            return;
        }
        aqra aqraVar = (aqra) adapterView.getSelectedItem();
        EditText editText = this.a;
        aqrc aqrcVar = aqraVar.c;
        if (aqrcVar == null) {
            aqrcVar = aqrc.a;
        }
        if ((aqrcVar.b & 1) != 0) {
            aqrc aqrcVar2 = aqraVar.c;
            if (aqrcVar2 == null) {
                aqrcVar2 = aqrc.a;
            }
            aragVar = aqrcVar2.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        editText.setText(ajgl.b(aragVar));
        vxu vxuVar = this.b;
        aqrc aqrcVar3 = aqraVar.c;
        if (aqrcVar3 == null) {
            aqrcVar3 = aqrc.a;
        }
        vxuVar.d = aqrcVar3.g;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
