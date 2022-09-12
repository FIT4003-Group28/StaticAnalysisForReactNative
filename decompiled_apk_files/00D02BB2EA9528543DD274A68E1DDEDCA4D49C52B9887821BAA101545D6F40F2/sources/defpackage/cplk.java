package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RadioButton;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cplk  reason: default package */
/* loaded from: classes5.dex */
public final class cplk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(String str) {
        return (str.hashCode() % 100000) + 100000;
    }

    public static void b(String str, String str2, int i, int i2, ViewGroup viewGroup, cplj cpljVar) {
        RadioButton radioButton = (RadioButton) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_button, viewGroup, false);
        radioButton.setText(str2);
        radioButton.setId(i2);
        radioButton.setOnClickListener(new cpli(cpljVar, i, str));
        viewGroup.addView(radioButton);
    }
}
