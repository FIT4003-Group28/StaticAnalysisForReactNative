package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: kru  reason: default package */
/* loaded from: classes3.dex */
public final class kru implements ajru {
    private final Context a;
    private final ViewGroup b;
    private final TextView c;
    private final TextView d;
    private final aagi e;
    private aypg f;

    public kru(Context context, aagi aagiVar) {
        this.a = context;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.suggested_playlist_videos_selection_metadata, (ViewGroup) null);
        this.b = viewGroup;
        this.c = (TextView) viewGroup.findViewById(R.id.feed_source);
        this.d = (TextView) viewGroup.findViewById(R.id.video_count);
        this.e = aagiVar;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    public final void d(atjj atjjVar) {
        int size = atjjVar == null ? 0 : atjjVar.getSelectedVideoIds().size();
        String quantityString = this.a.getResources().getQuantityString(R.plurals.selected_video_count, size, Integer.valueOf(size));
        zag.m(this.d, quantityString);
        this.d.setContentDescription(quantityString);
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        ards ardsVar = (ards) obj;
        TextView textView = this.c;
        arag aragVar = ardsVar.b;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar));
        d((atjj) this.e.c().b(ardsVar.c));
        this.f = this.e.c().h(ardsVar.c, true).I(jgs.t).V(ktg.b).k(atjj.class).X(aypa.a()).as(new ayqb() { // from class: krt
            @Override // defpackage.ayqb
            public final void a(Object obj2) {
                kru.this.d((atjj) obj2);
            }
        });
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        aypg aypgVar = this.f;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
        }
    }
}
