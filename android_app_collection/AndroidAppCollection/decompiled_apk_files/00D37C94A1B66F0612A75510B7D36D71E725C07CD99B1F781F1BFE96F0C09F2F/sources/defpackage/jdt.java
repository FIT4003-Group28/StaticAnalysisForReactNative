package defpackage;

import android.view.View;
import android.widget.ListView;
/* compiled from: PG */
/* renamed from: jdt  reason: default package */
/* loaded from: classes3.dex */
public final class jdt implements View.OnClickListener {
    final /* synthetic */ jdy a;

    public jdt(jdy jdyVar) {
        this.a = jdyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        attl attlVar;
        agqb agqbVar;
        ahcw ahcwVar = this.a.j;
        ListView listView = ahcwVar.b;
        if (listView == null) {
            attlVar = attl.UNKNOWN_FORMAT_TYPE;
        } else {
            int checkedItemPosition = listView.getCheckedItemPosition();
            attlVar = (checkedItemPosition == -1 || (agqbVar = (agqb) ahcwVar.getItem(checkedItemPosition)) == null) ? attl.UNKNOWN_FORMAT_TYPE : agqbVar.a;
        }
        atpx atpxVar = atpx.DOWNLOAD_QUALITY_SETTINGS_ACTION_DONT_SAVE;
        if (this.a.g.isChecked()) {
            this.a.b.E(attlVar);
            atpxVar = atpx.DOWNLOAD_QUALITY_SETTINGS_ACTION_SAVE;
        }
        jdy jdyVar = this.a;
        ylx.m(jdyVar.c.d(jdyVar.g.isChecked()), gpe.o);
        this.a.f.dismiss();
        this.a.k.a(attlVar, atpxVar);
    }
}
