package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import c.e.a.a.g;
import com.google.firebase.components.d;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import java.util.Collections;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements h {
    @Override // com.google.firebase.components.h
    public List<d<?>> getComponents() {
        d.b a2 = d.a(g.class);
        a2.a(n.b(Context.class));
        a2.a(a.a());
        return Collections.singletonList(a2.b());
    }
}
