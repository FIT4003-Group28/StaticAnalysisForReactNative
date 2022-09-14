package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
/* loaded from: classes.dex */
public class ListFragment extends Fragment {
    private final Handler X = new Handler();
    private final Runnable Y = new a();
    private final AdapterView.OnItemClickListener Z = new b();
    ListAdapter a0;
    ListView b0;
    View c0;
    TextView d0;
    View e0;
    View f0;
    CharSequence g0;
    boolean h0;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListView listView = ListFragment.this.b0;
            listView.focusableViewAvailable(listView);
        }
    }

    /* loaded from: classes.dex */
    class b implements AdapterView.OnItemClickListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ListFragment.this.a((ListView) adapterView, view, i, j);
        }
    }

    private void a(boolean z, boolean z2) {
        m0();
        View view = this.e0;
        if (view != null) {
            if (this.h0 == z) {
                return;
            }
            this.h0 = z;
            if (z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(n(), 17432577));
                    this.f0.startAnimation(AnimationUtils.loadAnimation(n(), 17432576));
                } else {
                    view.clearAnimation();
                    this.f0.clearAnimation();
                }
                this.e0.setVisibility(8);
                this.f0.setVisibility(0);
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(n(), 17432576));
                this.f0.startAnimation(AnimationUtils.loadAnimation(n(), 17432577));
            } else {
                view.clearAnimation();
                this.f0.clearAnimation();
            }
            this.e0.setVisibility(0);
            this.f0.setVisibility(8);
            return;
        }
        throw new IllegalStateException("Can't be used with a custom content view");
    }

    private void m0() {
        if (this.b0 != null) {
            return;
        }
        View F = F();
        if (F == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (F instanceof ListView) {
            this.b0 = (ListView) F;
        } else {
            this.d0 = (TextView) F.findViewById(16711681);
            TextView textView = this.d0;
            if (textView == null) {
                this.c0 = F.findViewById(16908292);
            } else {
                textView.setVisibility(8);
            }
            this.e0 = F.findViewById(16711682);
            this.f0 = F.findViewById(16711683);
            View findViewById = F.findViewById(16908298);
            if (!(findViewById instanceof ListView)) {
                if (findViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            this.b0 = (ListView) findViewById;
            View view = this.c0;
            if (view != null) {
                this.b0.setEmptyView(view);
            } else {
                CharSequence charSequence = this.g0;
                if (charSequence != null) {
                    this.d0.setText(charSequence);
                    this.b0.setEmptyView(this.d0);
                }
            }
        }
        this.h0 = true;
        this.b0.setOnItemClickListener(this.Z);
        ListAdapter listAdapter = this.a0;
        if (listAdapter != null) {
            this.a0 = null;
            a(listAdapter);
        } else if (this.e0 != null) {
            a(false, false);
        }
        this.X.post(this.Y);
    }

    @Override // androidx.fragment.app.Fragment
    public void S() {
        this.X.removeCallbacks(this.Y);
        this.b0 = null;
        this.h0 = false;
        this.f0 = null;
        this.e0 = null;
        this.c0 = null;
        this.d0 = null;
        super.S();
    }

    @Override // androidx.fragment.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context j0 = j0();
        FrameLayout frameLayout = new FrameLayout(j0);
        LinearLayout linearLayout = new LinearLayout(j0);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(j0, null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(j0);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(j0);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(j0);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void a(View view, Bundle bundle) {
        super.a(view, bundle);
        m0();
    }

    public void a(ListAdapter listAdapter) {
        boolean z = false;
        boolean z2 = this.a0 != null;
        this.a0 = listAdapter;
        ListView listView = this.b0;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.h0 || z2) {
                return;
            }
            if (k0().getWindowToken() != null) {
                z = true;
            }
            a(true, z);
        }
    }

    public void a(ListView listView, View view, int i, long j) {
    }
}
