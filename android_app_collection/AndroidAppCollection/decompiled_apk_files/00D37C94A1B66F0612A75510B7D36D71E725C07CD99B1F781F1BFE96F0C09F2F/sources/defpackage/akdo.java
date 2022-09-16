package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: akdo  reason: default package */
/* loaded from: classes.dex */
public final class akdo extends akdi {
    public SharedPreferences a;
    private CharSequence ae;
    private TextView af;
    private TextView ag;
    private ImageView ah;
    public String[] b;
    public boolean c;
    public xpt d;
    private CharSequence e;

    public static String[] o(Context context, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!zfn.a(context, str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private final void p() {
        this.af.setText(this.ae);
        this.ag.setText(R.string.open_settings_button);
        this.c = true;
    }

    private static boolean q(Context context, String[] strArr) {
        return o(context, strArr).length == 0;
    }

    private final boolean r() {
        String[] strArr;
        Set<String> stringSet = this.a.getStringSet("permissions_requested", null);
        if (stringSet == null) {
            return false;
        }
        for (String str : this.b) {
            if (!zfn.a(mJ(), str) && stringSet.contains(str) && !mJ().shouldShowRequestPermissionRationale(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dp
    public final void X(int i, String[] strArr, int[] iArr) {
        xpt xptVar;
        if (strArr.length == 0 || iArr.length == 0) {
            return;
        }
        SharedPreferences.Editor edit = this.a.edit();
        HashSet hashSet = new HashSet(this.a.getStringSet("permissions_requested", amyg.a));
        Collections.addAll(hashSet, strArr);
        edit.putStringSet("permissions_requested", hashSet);
        edit.apply();
        if (r()) {
            p();
        }
        if (!q(mJ(), this.b) || (xptVar = this.d) == null) {
            return;
        }
        xptVar.a();
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        Bundle bundle2 = this.m;
        String[] stringArray = bundle2.getStringArray("missing_permissions");
        stringArray.getClass();
        this.b = stringArray;
        this.e = bundle2.getCharSequence("allow_access_description");
        this.ae = bundle2.getCharSequence("open_settings_description");
    }

    @Override // defpackage.dp
    public final void mS() {
        xpt xptVar;
        super.mS();
        if (!this.c || !q(mJ(), this.b) || (xptVar = this.d) == null) {
            return;
        }
        xptVar.a();
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.permission_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.permission_description);
        this.af = textView;
        textView.setText(this.e);
        TextView textView2 = (TextView) inflate.findViewById(R.id.action_button);
        this.ag = textView2;
        textView2.setOnClickListener(new akdn(this, 1));
        ImageView imageView = (ImageView) inflate.findViewById(R.id.close_button);
        this.ah = imageView;
        imageView.setOnClickListener(new akdn(this));
        if (r()) {
            p();
        }
        return inflate;
    }
}
