package tk.zeryter.DnDPlaySheetAndroid;

import android.app.ActionBar;
import android.graphics.drawable.Drawable;
import android.view.View;

public class Tabs {

    private ActionBar actionBar;

    private ActionBar.Tab basicDetailsTab = new ActionBar.Tab() {
        @Override
        public int getPosition() {
            return 0;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Drawable getIcon() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public CharSequence getText() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public ActionBar.Tab setIcon(Drawable icon) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public ActionBar.Tab setIcon(int resId) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public ActionBar.Tab setText(CharSequence text) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public ActionBar.Tab setText(int resId) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public ActionBar.Tab setCustomView(View view) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public ActionBar.Tab setCustomView(int layoutResId) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public View getCustomView() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public ActionBar.Tab setTag(Object obj) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Object getTag() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public ActionBar.Tab setTabListener(ActionBar.TabListener listener) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void select() {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public ActionBar.Tab setContentDescription(int resId) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public ActionBar.Tab setContentDescription(CharSequence contentDesc) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public CharSequence getContentDescription() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }
    };

    public void init(ActionBar actionBar) {

        this.actionBar = actionBar;

        actionBar.addTab(basicDetailsTab);

    }

}
