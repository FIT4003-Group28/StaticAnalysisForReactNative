package defpackage;

import android.content.Context;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ekh  reason: default package */
/* loaded from: classes3.dex */
public final class ekh extends ArrayAdapter {
    public final aafo a;
    public final akjm b;
    private final Context c;

    public ekh(Context context, aafo aafoVar, List list, akjm akjmVar) {
        super(context, 0);
        this.c = context;
        this.a = aafoVar;
        this.b = akjmVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aptj aptjVar = (aptj) it.next();
            if ((aptjVar.b & 1) != 0) {
                aurg aurgVar = aptjVar.c;
                add(aurgVar == null ? aurg.a : aurgVar);
            }
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        arag aragVar;
        if (view == null) {
            view = LayoutInflater.from(this.c).inflate(R.layout.channel_profile_editor_boolean_setting_field, viewGroup, false);
        }
        final aurg aurgVar = (aurg) getItem(i);
        TextView textView = (TextView) view.findViewById(R.id.title);
        if ((aurgVar.b & 16) != 0) {
            aragVar = aurgVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        SwitchCompat switchCompat = (SwitchCompat) view.findViewById(R.id.toggle);
        switchCompat.setOnCheckedChangeListener(null);
        switchCompat.setChecked(this.b.g(aurgVar));
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ekg
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                apzg apzgVar;
                ekh ekhVar = ekh.this;
                aurg aurgVar2 = aurgVar;
                ekhVar.b.d(aurgVar2, z);
                if (z) {
                    apzgVar = aurgVar2.h;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                } else {
                    apzgVar = aurgVar2.i;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                }
                ekhVar.a.a(apzgVar);
            }
        });
        return view;
    }
}
