package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import java.util.BitSet;
/* compiled from: PG */
/* renamed from: dhic  reason: default package */
/* loaded from: classes6.dex */
public abstract class dhic {
    public static dhib v() {
        return new dhhq();
    }

    private final BitSet y() {
        if (l() != null) {
            BitSet bitSet = new BitSet();
            bitSet.set(0, l().booleanValue());
            return bitSet;
        }
        return null;
    }

    public abstract Uri a();

    public abstract Bitmap b();

    public abstract Rect c();

    public abstract String d();

    public abstract Rect e();

    public abstract Location f();

    public abstract String g();

    public abstract byte[] h();

    public abstract Long i();

    public abstract Long j();

    public abstract Boolean k();

    public abstract Boolean l();

    public abstract csfh m();

    public abstract Integer n();

    public abstract Integer o();

    public abstract PointF p();

    public abstract Integer q();

    public abstract String r();

    public abstract Boolean s();

    public abstract Boolean t();

    public abstract dhib u();

    public final Bundle w(ckzp ckzpVar) {
        Bundle bundle = new Bundle();
        if (a() != null) {
            bundle.putParcelable("uri", a());
        }
        if (b() != null) {
            Bitmap b = b();
            int i = (ckzpVar.a & 4) != 0 ? ckzpVar.d : 33554432;
            if (b.getByteCount() > i) {
                b.getByteCount();
                float sqrt = (float) Math.sqrt(i / b.getByteCount());
                Matrix matrix = new Matrix();
                matrix.setScale(sqrt, sqrt);
                b = Bitmap.createBitmap(b, 0, 0, b.getWidth(), b.getHeight(), matrix, true);
            }
            bundle.putParcelable("bitmap", b);
        }
        if (h() != null) {
            bundle.putByteArray("image_payload", h());
        }
        if (r() != null) {
            bundle.putString("lens_fife_url", r());
        }
        if (d() != null) {
            bundle.putString("account", d());
        }
        if (e() != null) {
            bundle.putParcelable("crop_bounding_box", e());
        }
        if (f() != null) {
            bundle.putParcelable("location", f());
        }
        if (g() != null) {
            bundle.putString("image_place_id", g());
        }
        bundle.putInt("lens_transition_type", n() == null ? 0 : n().intValue());
        if (p() != null) {
            bundle.putParcelable("lens_tap_location", p());
        }
        if (q() != null) {
            bundle.putInt("lens_theme", q().intValue());
        }
        if (j() != null) {
            bundle.putLong("start_streaming_request_timestamp_nanos", j().longValue());
        }
        return bundle;
    }

    public final Bundle x() {
        Bundle bundle = new Bundle();
        if (i() != null) {
            bundle.putLong("activity_launch_timestamp_nanos", i().longValue());
        }
        if (k() != null) {
            bundle.putBoolean("hide_lens_close_button", k().booleanValue());
        }
        if (y() != null) {
            bundle.putSerializable("disable_lens_features", y());
        }
        if (m() != null) {
            bundle.putByteArray("lens_initial_parameters", m().bS());
        }
        if (o() != null) {
            bundle.putInt("lens_intent_type", o().intValue());
        }
        if (q() != null) {
            bundle.putInt("lens_theme", q().intValue());
        }
        if (s() != null) {
            bundle.putBoolean("disable_intent_optimizations_key", s().booleanValue());
        }
        if (c() != null) {
            bundle.putParcelable("lens_sreen_image_location", c());
        }
        if (g() != null) {
            bundle.putString("image_place_id", g());
        }
        if (t() != null) {
            bundle.putBoolean("promo_add_shorcut", t().booleanValue());
        }
        return bundle;
    }
}
