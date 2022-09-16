package com.google.android.apps.youtube.app.player.overlay;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.View;
import com.google.android.apps.youtube.app.player.overlay.ControlsRelativeLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ControlsRelativeLayout extends kds {
    public aacz a;
    private View b;
    private SparseBooleanArray c;

    public ControlsRelativeLayout(Context context) {
        super(context);
    }

    public final boolean a(View view) {
        if (this.b == null) {
            this.c = new SparseBooleanArray();
            this.b = findViewById(R.id.youtube_controls_bottom_ui_container);
        }
        if (this.c.indexOfKey(view.getId()) >= 0) {
            return this.c.get(view.getId());
        }
        boolean z = this.b.findViewById(view.getId()) != null;
        this.c.put(view.getId(), z);
        return z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addChildrenForAccessibility(ArrayList arrayList) {
        super.addChildrenForAccessibility(arrayList);
        asxj asxjVar = this.a.b().e;
        if (asxjVar == null) {
            asxjVar = asxj.a;
        }
        if (!asxjVar.aZ) {
            return;
        }
        Collections.sort(arrayList, new Comparator() { // from class: kbh
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                ControlsRelativeLayout controlsRelativeLayout = ControlsRelativeLayout.this;
                boolean a = controlsRelativeLayout.a((View) obj);
                if (a == controlsRelativeLayout.a((View) obj2)) {
                    return 0;
                }
                return a ? 1 : -1;
            }
        });
    }

    public ControlsRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
