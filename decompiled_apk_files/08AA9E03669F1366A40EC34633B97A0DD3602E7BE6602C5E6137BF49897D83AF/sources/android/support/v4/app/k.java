package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
/* compiled from: FragmentContainer.java */
/* loaded from: classes.dex */
public abstract class k {
    public abstract View a(int i);

    public abstract boolean a();

    public i a(Context context, String str, Bundle bundle) {
        return i.instantiate(context, str, bundle);
    }
}
