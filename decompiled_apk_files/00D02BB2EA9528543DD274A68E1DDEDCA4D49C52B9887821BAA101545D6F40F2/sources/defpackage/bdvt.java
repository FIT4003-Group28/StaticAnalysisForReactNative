package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdvt  reason: default package */
/* loaded from: classes3.dex */
public final class bdvt implements View.OnLongClickListener, PopupMenu.OnMenuItemClickListener {
    private final View a;
    private final CharSequence b;
    private final int c;
    private PopupMenu d;

    public bdvt(View view, CharSequence charSequence, int i) {
        this.a = view;
        this.b = charSequence;
        this.c = i;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.d == null) {
            PopupMenu popupMenu = new PopupMenu(this.a.getContext(), this.a);
            this.d = popupMenu;
            popupMenu.getMenu().add(this.c);
            this.d.setOnMenuItemClickListener(this);
        }
        this.d.show();
        return true;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Context context = this.a.getContext();
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(context.getString(R.string.COPIED_ADDRESS_LABEL), this.b));
        return true;
    }
}
