package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ajpf  reason: default package */
/* loaded from: classes.dex */
public final class ajpf {
    public static final /* synthetic */ int f = 0;
    public final actp a;
    public final View b;
    public final View c;
    public final View d;
    public boolean e;
    private final ajoz g;
    private final ajoz h;

    static {
        acuo.a(3832);
        acuo.a(6827);
    }

    public ajpf(Activity activity, SharedPreferences sharedPreferences, actp actpVar) {
        sharedPreferences.getClass();
        this.a = actpVar;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.interaction_logging_overlay, (ViewGroup) null);
        this.b = inflate;
        View findViewById = inflate.findViewById(R.id.main_overlay);
        this.c = findViewById;
        TextView textView = (TextView) inflate.findViewById(R.id.screen_name);
        TextView textView2 = (TextView) inflate.findViewById(R.id.parent_name);
        TextView textView3 = (TextView) inflate.findViewById(R.id.transition_name);
        inflate.findViewById(R.id.hide_button).setOnClickListener(new ajpc(this, 1));
        View findViewById2 = inflate.findViewById(R.id.show_button);
        this.d = findViewById2;
        findViewById2.setOnClickListener(new ajpc(this));
        ajpj ajpjVar = new ajpj((LinearLayout) inflate.findViewById(R.id.linear_layout_text), activity);
        this.g = ajpjVar;
        ajpjVar.b.setId(R.id.ve_shown_view);
        ajpk ajpkVar = new ajpk((ScrollView) inflate.findViewById(R.id.click_scroll_view), activity);
        this.h = ajpkVar;
        ajpkVar.b.setId(R.id.explicit_click_view);
        findViewById2.setOnLongClickListener(new ajpd());
        findViewById2.setOnDragListener(new ajpe(this));
        findViewById.setOnLongClickListener(new ajpd());
        findViewById.setOnDragListener(new ajpe(this));
        zhn.d(activity, R.attr.ytBrandRed);
        ake.d(activity, R.color.yt_light_green);
    }
}
