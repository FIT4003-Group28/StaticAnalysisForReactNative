package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.comment.ui.BackstagePollEditorView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.PostImagePickerRendererOuterClass;
import com.google.protos.youtube.api.innertube.SelectTaggedVideoButtonRendererOuterClass;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: xuz  reason: default package */
/* loaded from: classes4.dex */
public final class xuz extends xwl implements xru {
    public static final /* synthetic */ int bl = 0;
    private static final ColorDrawable bm = new ColorDrawable(0);
    public xva aA;
    public String aB;
    public String aC;
    public xxa aD;
    public EditText aE;
    public BackstagePollEditorView aF;
    public ajsm aG;
    public ampq aH;
    public View aI;
    public View aJ;
    public String aK;
    public String aL;
    public String aM;
    public boolean aN;
    public int aO;
    public DialogInterface.OnDismissListener aP;
    public xxe aQ;
    public TextView aR;
    public View aS;
    public ImageView aT;
    public TextView aU;
    public aviu aV;
    public arag aW;
    public arag aX;
    aypg aY;
    public bakk aZ;
    public ajmy ae;
    public aafo af;
    public xrw ag;
    public ajyi ah;
    public afvn ai;
    public akys aj;
    public acti ak;
    public ajsg al;
    public xty am;
    public ajmr an;
    public xwy ao;
    public xqj ap;
    public aagi aq;
    public akfc ar;
    public akge as;
    public Executor at;
    public ayor au;
    public snc av;
    public xrl aw;
    public xqv ax;
    public xse ay;
    public apli az;
    public RecyclerView ba;
    public RecyclerView bb;
    public View bc;
    amuk bd;
    public xwx be;
    public boolean bf = false;
    ViewTreeObserver.OnGlobalLayoutListener bg;
    ViewTreeObserver.OnGlobalLayoutListener bh;
    public boolean bi;
    public iia bj;
    public vne bk;
    private MenuItem bn;
    private View bo;
    private xxf bp;
    private ajsm bq;
    private View br;
    private View bs;
    private FrameLayout bt;
    private ajnj bu;
    private int bv;
    private int bw;
    private TextView bx;
    private ImageView by;
    private Pattern bz;

    public static xuz aE(apli apliVar) {
        apliVar.getClass();
        xuz xuzVar = new xuz();
        Bundle bundle = new Bundle();
        aphq.m(bundle, "renderer", apliVar);
        xuzVar.ae(bundle);
        return xuzVar;
    }

    private final apzg aX() {
        apld apldVar = this.az.l;
        if (apldVar == null) {
            apldVar = apld.a;
        }
        if ((apldVar.b & 1) != 0) {
            apld apldVar2 = this.az.l;
            if (apldVar2 == null) {
                apldVar2 = apld.a;
            }
            apoj apojVar = apldVar2.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            if ((apojVar.b & 16384) != 0) {
                apld apldVar3 = this.az.l;
                if (apldVar3 == null) {
                    apldVar3 = apld.a;
                }
                apoj apojVar2 = apldVar3.c;
                if (apojVar2 == null) {
                    apojVar2 = apoj.a;
                }
                apzg apzgVar = apojVar2.o;
                return apzgVar == null ? apzg.a : apzgVar;
            }
        }
        return null;
    }

    private final void aY() {
        argj argjVar;
        argj argjVar2;
        argj argjVar3;
        ampq aF = aF();
        if (this.bc.getVisibility() == 0 && aF.h()) {
            aunb aunbVar = ((auqq) aF.c()).c;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            argl arglVar = ((apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer)).m;
            if (arglVar == null) {
                arglVar = argl.a;
            }
            if (arglVar.b == 102716411) {
                aunb aunbVar2 = ((auqq) aF.c()).c;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                apoj apojVar = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
                akfc akfcVar = this.ar;
                argl arglVar2 = apojVar.m;
                if (arglVar2 == null) {
                    arglVar2 = argl.a;
                }
                if (arglVar2.b == 102716411) {
                    argjVar3 = (argj) arglVar2.c;
                } else {
                    argjVar3 = argj.a;
                }
                akfcVar.b(argjVar3, this.bc, apojVar, this.ak);
                return;
            }
        }
        apld apldVar = this.az.l;
        if (apldVar == null) {
            apldVar = apld.a;
        }
        apoj apojVar2 = apldVar.c;
        if (apojVar2 == null) {
            apojVar2 = apoj.a;
        }
        argl arglVar3 = apojVar2.m;
        if (arglVar3 == null) {
            arglVar3 = argl.a;
        }
        if (arglVar3.b != 102716411) {
            apli apliVar = this.az;
            if ((apliVar.c & 64) == 0) {
                return;
            }
            aunb aunbVar3 = apliVar.B;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            apoj apojVar3 = (apoj) aunbVar3.qm(ButtonRendererOuterClass.buttonRenderer);
            argl arglVar4 = apojVar3.m;
            if (arglVar4 == null) {
                arglVar4 = argl.a;
            }
            if (arglVar4.b != 102716411) {
                return;
            }
            akfc akfcVar2 = this.ar;
            argl arglVar5 = apojVar3.m;
            if (arglVar5 == null) {
                arglVar5 = argl.a;
            }
            if (arglVar5.b == 102716411) {
                argjVar = (argj) arglVar5.c;
            } else {
                argjVar = argj.a;
            }
            akfcVar2.b(argjVar, this.aT, apojVar3, this.ak);
            return;
        }
        apld apldVar2 = this.az.l;
        if (apldVar2 == null) {
            apldVar2 = apld.a;
        }
        apoj apojVar4 = apldVar2.c;
        if (apojVar4 == null) {
            apojVar4 = apoj.a;
        }
        akfc akfcVar3 = this.ar;
        argl arglVar6 = apojVar4.m;
        if (arglVar6 == null) {
            arglVar6 = argl.a;
        }
        if (arglVar6.b == 102716411) {
            argjVar2 = (argj) arglVar6.c;
        } else {
            argjVar2 = argj.a;
        }
        akfcVar3.b(argjVar2, this.by, apojVar4, this.ak);
    }

    private final void ba(View view, awar awarVar, boolean z) {
        View findViewById = view.findViewById(R.id.video_removal_button);
        zag.o(findViewById, z);
        findViewById.setOnClickListener(new xun(this, 3));
        ajrs ajrsVar = new ajrs();
        ajrsVar.a(this.ak);
        View c = this.bp.c(ajrsVar, awarVar);
        zag.o(this.aI, true);
        this.bt.addView(c);
        this.aK = awarVar.e;
    }

    private final void bb(Dialog dialog, int i) {
        new AlertDialog.Builder(mJ()).setMessage(i).setNegativeButton(R.string.comments_discard_negative_button, new gzj(10)).setPositiveButton(R.string.comments_discard_positive_button, new xur(this, dialog)).setCancelable(false).create().show();
    }

    private final boolean bc() {
        ajsm ajsmVar;
        if (TextUtils.isEmpty(this.aB)) {
            ajsm ajsmVar2 = this.aG;
            if (ajsmVar2 != null && !ajsmVar2.isEmpty()) {
                return true;
            }
            return (bi() == 3 && (ajsmVar = this.bq) != null && !ajsmVar.isEmpty()) || this.ba.getVisibility() == 0;
        }
        return true;
    }

    private final boolean bd() {
        arag aragVar;
        String trim = this.aE.getText().toString().trim();
        apli apliVar = this.az;
        if ((apliVar.b & 128) != 0) {
            aragVar = apliVar.j;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        return !TextUtils.equals(trim, zgh.d(ajgl.b(aragVar)));
    }

    private final boolean be() {
        return TextUtils.getTrimmedLength(this.aE.getText()) > 0;
    }

    private final boolean bf() {
        xxa xxaVar = this.aD;
        if (xxaVar == null || !xxaVar.c()) {
            ajsm ajsmVar = this.aG;
            if (ajsmVar != null && !ajsmVar.isEmpty()) {
                return true;
            }
            ajsm ajsmVar2 = this.bq;
            return (ajsmVar2 != null && !ajsmVar2.isEmpty()) || this.aI.getVisibility() == 0 || this.aF.getVisibility() == 0 || this.ba.getVisibility() == 0;
        }
        return true;
    }

    private final boolean bg() {
        return rh().getConfiguration().orientation == 1;
    }

    private final boolean bh() {
        auez auezVar;
        apli apliVar = this.az;
        if ((apliVar.b & 32768) != 0) {
            auezVar = apliVar.q;
            if (auezVar == null) {
                auezVar = auez.a;
            }
        } else {
            auezVar = null;
        }
        if (auezVar != null) {
            apok apokVar = auezVar.c;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            return (apokVar.b & 1) != 0;
        }
        return false;
    }

    private final int bi() {
        apli apliVar = this.az;
        if (apliVar != null) {
            int i = apliVar.b;
            if ((i & 2048) != 0) {
                if ((i & 4096) != 0) {
                    int u = akpq.u(apliVar.n);
                    if (u != 0) {
                        return u;
                    }
                    return 1;
                }
                aplq aplqVar = apliVar.m;
                if (aplqVar == null) {
                    aplqVar = aplq.a;
                }
                int i2 = aplqVar.b;
                if (i2 == 50577878) {
                    return 4;
                }
                if (i2 == 120744665) {
                    return 3;
                }
                return i2 == 50732276 ? 6 : 2;
            }
        }
        return 2;
    }

    @Override // defpackage.xru
    public final void a() {
        xxa xxaVar = this.aD;
        if (xxaVar != null) {
            xxaVar.b(3);
        }
        aL();
    }

    public final ampq aF() {
        apli apliVar = this.az;
        if (apliVar == null) {
            return amon.a;
        }
        aunb aunbVar = apliVar.f91J;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        return ampq.i((auqq) aunbVar.qm(SelectTaggedVideoButtonRendererOuterClass.selectTaggedVideoButtonRenderer));
    }

    public final aufp aG() {
        aufm aufmVar;
        if ((this.az.c & 65536) == 0 || (aufmVar = (aufm) this.aq.a(this.ai.c()).f(this.az.H).g(aufm.class).W()) == null || (aufmVar.b.b & 2) == 0) {
            return null;
        }
        return aufmVar.getPostCreationData();
    }

    public final Pattern aH() {
        if (this.bz == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("(?:%[0-9a-fA-F]{2}|[-\\w./&?+=~:;\\'!(){}@#,*$ -\ud7ff\ue000-\ufdcfﷰ-�က0-\u1fffd\u20000-\u2fffd\u30000-㿿d䀀0-俿d倀0-忿d怀0-濿d瀀0-翿d耀0-迿d退0-\u9fffdꀀ0-꿿d뀀0-뿿d쀀0-쿿d퀀0-\udfffd\ue0000-\uefffd\uf0000-\uffffdက00-ჿfd])*");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("(?:%[0-9a-fA-F]{2}|[-\\w/&?+=~:;\\'!(@#*$ -\ud7ff\ue000-\ufdcfﷰ-�က0-\u1fffd\u20000-\u2fffd\u30000-㿿d䀀0-俿d倀0-忿d怀0-濿d瀀0-翿d耀0-迿d退0-\u9fffdꀀ0-꿿d뀀0-뿿d쀀0-쿿d퀀0-\udfffd\ue0000-\uefffd\uf0000-\uffffdက00-ჿfd])");
            this.bz = Pattern.compile("(?i)(https?://" + ((CharSequence) sb) + ((CharSequence) sb2) + ")");
        }
        return this.bz;
    }

    public final void aI() {
        zag.o(this.br, false);
    }

    public final void aJ() {
        zag.o(this.bs, false);
    }

    public final void aK() {
        arag aragVar = null;
        this.ak.H(3, new acte(actj.BACKSTAGE_POST_DIALOG_CANCEL_BUTTON), null);
        Dialog dialog = this.d;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        apli apliVar = this.az;
        if ((apliVar.b & 128) != 0 && (aragVar = apliVar.j) == null) {
            aragVar = arag.a;
        }
        if (TextUtils.isEmpty(ajgl.b(aragVar))) {
            aplq aplqVar = this.az.m;
            if (aplqVar == null) {
                aplqVar = aplq.a;
            }
            if (aplqVar.b != 120744665) {
                if (be() || bf()) {
                    bb(dialog, R.string.discard_post);
                    return;
                }
                dialog.cancel();
            }
        }
        if (bd()) {
            bb(dialog, R.string.discard_edits);
            return;
        }
        dialog.cancel();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r4.aJ.getVisibility() == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        if ((r4.az.b & 128) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
        r0 = r4.az;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
        if ((r0.b & 67108864) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
        r0 = r0.u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
        if (r0 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
        r0 = defpackage.arag.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
        if (android.text.TextUtils.isEmpty(defpackage.ajgl.b(r0)) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
        r0 = r4.az;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
        if ((r0.b & 67108864) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
        r1 = r0.u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        if (r1 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        r1 = defpackage.arag.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
        r0 = defpackage.ajgl.b(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aL() {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xuz.aL():void");
    }

    public final void aM() {
        String replaceAll = aH().matcher(this.aE.getText()).replaceAll("");
        if (replaceAll == null || replaceAll.contentEquals(this.aE.getText())) {
            return;
        }
        this.aE.setText(replaceAll);
        this.aE.setSelection(replaceAll.length());
    }

    public final void aN(arag aragVar) {
        MenuItem menuItem = this.bn;
        if (menuItem == null || aragVar == null) {
            return;
        }
        menuItem.setTitle(ajgl.b(aragVar));
    }

    public final void aO(boolean z) {
        MenuItem menuItem = this.bn;
        if (menuItem == null) {
            return;
        }
        menuItem.setEnabled(z);
    }

    public final void aP(List list) {
        arag aragVar;
        final BackstagePollEditorView backstagePollEditorView = this.aF;
        backstagePollEditorView.c();
        apok apokVar = backstagePollEditorView.a.c;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        boolean z = true;
        aqxo.y(1 == (apokVar.b & 1));
        if (backstagePollEditorView.b != null) {
            z = false;
        }
        aqxo.z(z, "Create option button can be added only once.");
        backstagePollEditorView.b = (TextView) LayoutInflater.from(backstagePollEditorView.getContext()).inflate(R.layout.backstage_poll_editor_create_option, (ViewGroup) backstagePollEditorView, false);
        TextView textView = backstagePollEditorView.b;
        apok apokVar2 = backstagePollEditorView.a.c;
        if (apokVar2 == null) {
            apokVar2 = apok.a;
        }
        apoj apojVar = apokVar2.c;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        if ((apojVar.b & 256) != 0) {
            apok apokVar3 = backstagePollEditorView.a.c;
            if (apokVar3 == null) {
                apokVar3 = apok.a;
            }
            apoj apojVar2 = apokVar3.c;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
            aragVar = apojVar2.i;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        backstagePollEditorView.b.setOnClickListener(new View.OnClickListener() { // from class: xtz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackstagePollEditorView backstagePollEditorView2 = BackstagePollEditorView.this;
                backstagePollEditorView2.b("");
                xut xutVar = backstagePollEditorView2.c;
                if (xutVar != null) {
                    xutVar.a();
                }
            }
        });
        TextView textView2 = backstagePollEditorView.b;
        zag.k(textView2, textView2.getBackground());
        backstagePollEditorView.addView(backstagePollEditorView.b);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            backstagePollEditorView.b((String) it.next());
        }
        for (int size = backstagePollEditorView.a().size(); size < backstagePollEditorView.a.e; size++) {
            backstagePollEditorView.b("");
        }
        this.aF.setVisibility(0);
        aL();
    }

    public final boolean aR() {
        apli apliVar = this.az;
        return (apliVar == null || (apliVar.b & 4) == 0) ? false : true;
    }

    public final boolean aS() {
        int u;
        int k;
        apli apliVar = this.az;
        return (apliVar == null || (u = akpq.u(apliVar.n)) == 0 || u != 5 || (k = alwb.k(this.az.w)) == 0 || k != 3) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean aT() {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xuz.aT():boolean");
    }

    @Override // defpackage.xru
    public final void b(String str) {
        this.aB = str;
        xxa xxaVar = this.aD;
        if (xxaVar != null) {
            xxaVar.b(4);
        }
        aL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0165, code lost:
        if (r0 > r7) goto L49;
     */
    @Override // defpackage.xru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.graphics.drawable.Drawable r7, int r8) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xuz.c(android.graphics.drawable.Drawable, int):void");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, ajsa] */
    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        aoqu aoquVar;
        super.mQ(bundle);
        BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint = null;
        try {
            aoquVar = aphq.j(this.m, "renderer", apli.a, aoos.b());
        } catch (RuntimeException unused) {
            zep.b("Failed to merge proto for renderer");
            aoquVar = null;
        }
        this.az = (apli) aoquVar;
        this.bp = new xxf(mJ(), this.ah.get());
        apok apokVar = this.az.k;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        apoj apojVar = apokVar.c;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        arag aragVar = apojVar.i;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        this.aW = aragVar;
        apli apliVar = this.az;
        if ((apliVar.c & 2048) != 0) {
            aunb aunbVar = apliVar.E;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            arag aragVar2 = ((apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer)).i;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            this.aX = aragVar2;
        }
        this.aZ = bakj.a("MMM d, yyyy, hh:mm a").c(baht.j(baht.k().a(this.av.c())));
        apzg aX = aX();
        if (aX != null) {
            backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint = (BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint) aX.qm(BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.backstageImageUploadEndpoint);
        }
        boolean z = false;
        if (backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint != null) {
            aunb aunbVar2 = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.j;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            if (aunbVar2.qn(PostImagePickerRendererOuterClass.postImagePickerRenderer)) {
                z = true;
            }
        }
        this.bf = z;
        if (z) {
            final xqv xqvVar = this.ax;
            String str = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.c;
            String str2 = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.d;
            xqvVar.e = str;
            xqvVar.f = str2;
            xqvVar.d.h(xqvVar.a.e(new xrk() { // from class: xqu
                @Override // defpackage.xrk
                public final void a(xrj xrjVar) {
                    xqv xqvVar2 = xqv.this;
                    xqvVar2.c.clear();
                    amuk a = xrjVar.a();
                    int size = a.size();
                    for (int i = 0; i < size; i++) {
                        xrp xrpVar = (xrp) a.get(i);
                        int i2 = xrpVar.e;
                        if (i2 != 3 && i2 != 1) {
                            xqvVar2.c.add(xrpVar.a);
                        }
                    }
                    if (xqvVar2.g == null) {
                        xqvVar2.d();
                    }
                }
            }));
            xqvVar.d.h(xqvVar.a.d(new xri() { // from class: xqt
                @Override // defpackage.xri
                public final void a(xrh xrhVar) {
                    xqv xqvVar2 = xqv.this;
                    amuk a = xrhVar.a();
                    int size = a.size();
                    for (int i = 0; i < size; i++) {
                        xqvVar2.c.remove(((xrp) a.get(i)).a);
                    }
                }
            }));
            xqvVar.b.a(xqvVar);
            xqvVar.h = xqvVar.d.g();
            xqvVar.b.a(xqvVar);
        }
        this.bg = new xue(this, 1);
        this.bh = new xue(this);
        this.aH = amon.a;
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mR() {
        super.mR();
        aypg aypgVar = this.aY;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
        }
        if ((this.az.c & 1024) != 0) {
            aajs c = this.aq.a(this.ai.c()).c();
            c.g(this.az.D);
            c.b().Q();
        }
        this.ag.b(this);
        this.ap.f(this.aD);
        ajsm ajsmVar = this.aG;
        if (ajsmVar != null) {
            ajsmVar.clear();
        }
        ajsm ajsmVar2 = this.bq;
        if (ajsmVar2 != null) {
            ajsmVar2.clear();
        }
        this.bp.e(this.bt);
        amuk amukVar = this.bd;
        if (amukVar != null) {
            int i = ((amxx) amukVar).c;
            for (int i2 = 0; i2 < i; i2++) {
                ((aypg) amukVar.get(i2)).qr();
            }
        }
        if (this.bf) {
            xqv xqvVar = this.ax;
            xqvVar.e = null;
            xqvVar.f = null;
            xqvVar.b.b(xqvVar);
            amuk amukVar2 = xqvVar.h;
            int i3 = ((amxx) amukVar2).c;
            for (int i4 = 0; i4 < i3; i4++) {
                ((aypg) amukVar2.get(i4)).qr();
            }
            xrl xrlVar = this.aw;
            ylr.c();
            xrlVar.f.clear();
            xrlVar.g.clear();
            xwx xwxVar = this.be;
            if (xwxVar == null) {
                return;
            }
            amuk amukVar3 = xwxVar.i;
            int i5 = ((amxx) amukVar3).c;
            for (int i6 = 0; i6 < i5; i6++) {
                ((aypg) amukVar3.get(i6)).qr();
            }
            xwxVar.g.f(xwxVar);
        }
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mS() {
        super.mS();
        Dialog dialog = this.d;
        if (dialog == null) {
            return;
        }
        Window window = dialog.getWindow();
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(bm);
        window.setSoftInputMode(5);
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x09af  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x09c1  */
    @Override // defpackage.dp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mc(android.view.LayoutInflater r23, android.view.ViewGroup r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 2528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xuz.mc(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        TextView textView;
        super.onConfigurationChanged(configuration);
        if (!bg()) {
            aI();
            aJ();
        }
        if (!aR() || (textView = this.aR) == null) {
            return;
        }
        textView.getViewTreeObserver().addOnGlobalLayoutListener(this.bg);
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.aP;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        this.ak.t();
    }

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        return new xuw(this, mJ(), this.b);
    }

    public final void aQ(aufp aufpVar) {
        boolean z = false;
        if (this.aK != null || (this.az.c & 65536) == 0) {
            zag.o(this.bc, false);
            return;
        }
        if (aufpVar != null && (aufpVar.b & 1) != 0) {
            z = true;
        }
        zag.o(this.bc, true ^ z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, ajsa] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, ajsa] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, ajsa] */
    private final void aZ(View view, aplq aplqVar, aplj apljVar) {
        apll apllVar;
        final apkt apktVar;
        aqtb aqtbVar;
        apkt apktVar2;
        Integer num;
        int k = alwb.k(this.az.w);
        int i = 1;
        if (k == 0) {
            k = 1;
        }
        int i2 = k - 1;
        if (i2 != 1) {
            if (i2 == 2) {
                int i3 = aplqVar.b;
                if (i3 == 120744665) {
                    this.aG = new ajsm();
                    ajsf a = this.al.a(this.ah.get());
                    a.h(this.aG);
                    RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.image_attachment);
                    recyclerView.ag(new LinearLayoutManager());
                    recyclerView.ad(a);
                    ajsm ajsmVar = this.aG;
                    if (aplqVar.b == 120744665) {
                        apktVar2 = (apkt) aplqVar.c;
                    } else {
                        apktVar2 = apkt.a;
                    }
                    ajsmVar.add(apktVar2);
                    zag.o(recyclerView, true);
                    return;
                } else if (i3 == 50577878) {
                    ba(view, (awar) aplqVar.c, false);
                    return;
                } else if (i3 != 153515154) {
                    return;
                } else {
                    this.bq = new ajsm();
                    ajsf a2 = this.al.a(this.ah.get());
                    a2.h(this.bq);
                    RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.attachment_view);
                    recyclerView2.ag(new LinearLayoutManager());
                    recyclerView2.ad(a2);
                    if (aplqVar.b == 153515154) {
                        aqtbVar = (aqtb) aplqVar.c;
                    } else {
                        aqtbVar = aqtb.a;
                    }
                    this.bq.add(ajhh.a(aqtbVar));
                    zag.o(recyclerView2, true);
                    return;
                }
            }
            apli apliVar = this.az;
            if ((apliVar.b & 536870912) != 0) {
                int k2 = alwb.k(apliVar.w);
                if (k2 != 0) {
                    i = k2;
                }
                num = Integer.valueOf(i - 1);
            } else {
                num = null;
            }
            String valueOf = String.valueOf(num);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("Unsupported purpose: ");
            sb.append(valueOf);
            zep.b(sb.toString());
        } else if (aplqVar == null || aplqVar.b != 120744665) {
            if (aplqVar != null && aplqVar.b == 50577878) {
                ba(view, (awar) aplqVar.c, true);
            } else if (apljVar == null || apljVar.b != 34 || !bh()) {
            } else {
                if (apljVar.b == 34) {
                    apllVar = (apll) apljVar.c;
                } else {
                    apllVar = apll.a;
                }
                aP(apllVar.b);
            }
        } else {
            aplq aplqVar2 = this.az.m;
            if (aplqVar2 == null) {
                aplqVar2 = aplq.a;
            }
            if (aplqVar2.b != 120744665) {
                return;
            }
            apli apliVar2 = this.az;
            if ((apliVar2.b & 134217728) != 0) {
                aplk aplkVar = apliVar2.v;
                if (aplkVar == null) {
                    aplkVar = aplk.a;
                }
                if (!aplkVar.b.isEmpty()) {
                    if (aplqVar2.b == 120744665) {
                        apktVar = (apkt) aplqVar2.c;
                    } else {
                        apktVar = apkt.a;
                    }
                    zag.o(this.aJ, true);
                    this.aG = new ajsm();
                    ajsf a3 = this.al.a(this.ah.get());
                    a3.h(this.aG);
                    final ImageView imageView = (ImageView) view.findViewById(R.id.prefilled_image_removal_button);
                    RecyclerView recyclerView3 = (RecyclerView) view.findViewById(R.id.prefilled_image);
                    recyclerView3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xuq
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                            apkt apktVar3 = apkt.this;
                            ImageView imageView2 = imageView;
                            int i12 = xuz.bl;
                            avhn avhnVar = apktVar3.b;
                            if (avhnVar == null) {
                                avhnVar = avhn.a;
                            }
                            zgd.t(imageView2, zgd.o((i6 - i4) - ((int) (akel.p(avhnVar) * (i7 - i5)))), ViewGroup.MarginLayoutParams.class);
                        }
                    });
                    recyclerView3.ag(new LinearLayoutManager());
                    recyclerView3.ad(a3);
                    this.aG.add(apktVar);
                    aplk aplkVar2 = this.az.v;
                    if (aplkVar2 == null) {
                        aplkVar2 = aplk.a;
                    }
                    this.aB = aplkVar2.b;
                    aplk aplkVar3 = this.az.v;
                    if (aplkVar3 == null) {
                        aplkVar3 = aplk.a;
                    }
                    this.aC = aplkVar3.c;
                    imageView.setOnClickListener(new xun(this));
                    return;
                }
            }
            zep.b("prefilled image post missed encryptedBlobId");
        }
    }
}
