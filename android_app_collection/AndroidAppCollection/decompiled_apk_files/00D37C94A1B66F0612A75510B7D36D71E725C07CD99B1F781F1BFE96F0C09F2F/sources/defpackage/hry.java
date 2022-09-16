package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hry  reason: default package */
/* loaded from: classes3.dex */
public final class hry extends dp {
    public hnr a;

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.draw_fragment, viewGroup, false);
        frameLayout.findViewById(R.id.draw_done_button).setOnClickListener(new View.OnClickListener() { // from class: hrx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hry hryVar = hry.this;
                hnr hnrVar = hryVar.a;
                if (hnrVar != null) {
                    hnrVar.a.be();
                    ex l = hryVar.z.l();
                    l.m(hryVar);
                    l.a();
                }
            }
        });
        return frameLayout;
    }
}
