package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akoe  reason: default package */
/* loaded from: classes.dex */
public final class akoe implements ajru {
    public akok a;
    public int b;
    private final View c;
    private final TextView d;
    private final ImageView e;

    public akoe(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.share_bottom_sheet_item, (ViewGroup) null);
        this.c = inflate;
        this.d = (TextView) inflate.findViewById(R.id.list_item_text);
        this.e = (ImageView) inflate.findViewById(R.id.list_item_icon_primary);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: akod
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i;
                akoe akoeVar = akoe.this;
                akok akokVar = akoeVar.a;
                if (akokVar == null || (i = akoeVar.b) == -1) {
                    return;
                }
                akokVar.f(i);
            }
        });
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        vez vezVar = (vez) obj;
        this.d.setText(vezVar.c);
        this.e.setImageDrawable(vezVar.e);
        this.a = (akok) ajrsVar.c("LISTENER_CONTEXT_DECORATOR_KEY");
        this.b = ajrsVar.b("position", -1);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
