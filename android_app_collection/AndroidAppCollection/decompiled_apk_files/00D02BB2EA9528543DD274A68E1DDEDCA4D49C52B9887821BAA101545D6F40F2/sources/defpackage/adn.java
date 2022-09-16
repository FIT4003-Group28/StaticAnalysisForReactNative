package defpackage;

import android.database.Cursor;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adn  reason: default package */
/* loaded from: classes2.dex */
public final class adn implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ adv a;

    public adn(adv advVar) {
        this.a = advVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        adv advVar = this.a;
        adq adqVar = advVar.o;
        if (adqVar == null || !adqVar.b()) {
            Editable text = advVar.a.getText();
            Cursor cursor = advVar.r.d;
            if (cursor == null) {
                return;
            }
            if (cursor.moveToPosition(i)) {
                CharSequence c = advVar.r.c(cursor);
                if (c != null) {
                    advVar.t(c);
                    return;
                } else {
                    advVar.t(text);
                    return;
                }
            }
            advVar.t(text);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
