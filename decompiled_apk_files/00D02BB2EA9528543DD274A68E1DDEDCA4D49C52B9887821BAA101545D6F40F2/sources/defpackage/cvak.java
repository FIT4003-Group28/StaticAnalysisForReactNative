package defpackage;

import android.view.MenuItem;
import android.widget.TextView;
import java.util.List;
/* compiled from: PG */
/* renamed from: cvak  reason: default package */
/* loaded from: classes5.dex */
public interface cvak extends cuvv, czvb {
    void a(cufp cufpVar, List<cufj> list);

    cuvg b();

    void c(int i);

    MenuItem d(String str, int i, byte[] bArr, MenuItem.OnMenuItemClickListener onMenuItemClickListener);

    void e();

    MenuItem f(int i, MenuItem.OnMenuItemClickListener onMenuItemClickListener);

    MenuItem g(String str, int i, MenuItem.OnMenuItemClickListener onMenuItemClickListener);

    void setSubtitle(CharSequence charSequence);

    void setSubtitle(CharSequence charSequence, TextView.BufferType bufferType);

    void setSubtitleContentDescription(CharSequence charSequence);

    void setTitle(String str);
}
