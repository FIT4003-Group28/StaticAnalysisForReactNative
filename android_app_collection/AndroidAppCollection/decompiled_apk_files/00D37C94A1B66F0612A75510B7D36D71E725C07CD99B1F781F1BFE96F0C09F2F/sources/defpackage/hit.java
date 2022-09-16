package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SfvAudioSearchBoxRendererOuterClass;
/* compiled from: PG */
/* renamed from: hit  reason: default package */
/* loaded from: classes3.dex */
public final class hit extends ajsl {
    public final aafo a;
    public final ajxz b;
    public View c;
    private final Context d;

    public hit(aafo aafoVar, Context context, ajxz ajxzVar) {
        this.d = context;
        this.a = aafoVar;
        this.b = ajxzVar;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        ausv ausvVar = (ausv) obj;
        View inflate = LayoutInflater.from(this.d).inflate(R.layout.music_picker_header, (ViewGroup) null);
        this.c = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.music_picker_header_title_text);
        arag aragVar = ausvVar.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        textView.setText(ajgl.b(aragVar));
        if ((ausvVar.b & 2) != 0) {
            aunb aunbVar = ausvVar.d;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            final ausw auswVar = (ausw) aunbVar.qm(SfvAudioSearchBoxRendererOuterClass.sfvAudioSearchBoxRenderer);
            View findViewById = this.c.findViewById(R.id.music_picker_search_box);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: his
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    hit hitVar = hit.this;
                    ausw auswVar2 = auswVar;
                    aafo aafoVar = hitVar.a;
                    apzg apzgVar = auswVar2.b;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.a(apzgVar);
                }
            });
        }
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((ausv) obj).e.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
