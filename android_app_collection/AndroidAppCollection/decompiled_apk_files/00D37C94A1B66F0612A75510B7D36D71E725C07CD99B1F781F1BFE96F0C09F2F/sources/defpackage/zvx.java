package defpackage;

import android.content.Context;
import android.media.ThumbnailUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: zvx  reason: default package */
/* loaded from: classes4.dex */
public final class zvx extends xo {
    public final zwj d;
    public final ArrayList e = new ArrayList();
    public boolean f = false;
    public boolean g = false;
    private final Context h;

    public zvx(Context context, zwj zwjVar) {
        this.h = context;
        this.d = zwjVar;
    }

    @Override // defpackage.xo
    public final int b() {
        return this.e.size();
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ yo f(ViewGroup viewGroup, int i) {
        return new zvw(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.album_list_entry, viewGroup, false));
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void o(yo yoVar, int i) {
        zvw zvwVar = (zvw) yoVar;
        zvwVar.a.setOnClickListener(new zvv(this, zvwVar));
        zvwVar.t.setImageBitmap(ThumbnailUtils.extractThumbnail(zvr.a(this.h, (DeviceLocalFile) ((zvu) this.e.get(i)).b.c(), null), 512, 512, 2));
        zvwVar.u.setText(((zvu) this.e.get(i)).d);
        zvwVar.v.setText(String.format(Locale.US, "%d", Integer.valueOf(((zvu) this.e.get(i)).c)));
    }
}
